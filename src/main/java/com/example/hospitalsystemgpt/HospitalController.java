package com.example.hospitalsystemgpt;

/**
 * Controller for coordinating hospital workflows between services and the GUI.
 */
public class HospitalController {
    private final PatientService patientService;
    private final AppointmentService appointmentService;
    private final MedicalRecordService medicalRecordService;
    private final BillingService billingService;
    private final InventoryService inventoryService;

    /**
     * Constructs a HospitalController with all service dependencies.
     */
    public HospitalController(PatientService patientService,
                             AppointmentService appointmentService,
                             MedicalRecordService medicalRecordService,
                             BillingService billingService,
                             InventoryService inventoryService) {
        this.patientService = patientService;
        this.appointmentService = appointmentService;
        this.medicalRecordService = medicalRecordService;
        this.billingService = billingService;
        this.inventoryService = inventoryService;
    }

    /** Registers a new patient. */
    public void registerPatient(Patient patient) {
        patientService.registerPatient(patient);
    }

    /** Schedules a new appointment. */
    public void scheduleAppointment(Appointment appointment) {
        appointmentService.scheduleAppointment(appointment);
    }

    /** Adds a new medical record. */
    public void addMedicalRecord(MedicalRecord record) {
        medicalRecordService.addMedicalRecord(record);
    }

    /** Creates a new bill. */
    public void createBill(Bill bill) {
        billingService.createBill(bill);
    }

    /** Marks a bill as paid. */
    public void markBillAsPaid(String billId, String paymentReference) {
        billingService.markBillAsPaid(billId, paymentReference);
    }

    /** Adds a new inventory item. */
    public void addInventoryItem(InventoryItem item) {
        inventoryService.addInventoryItem(item);
    }

    /** Updates an inventory item. */
    public void updateInventoryItem(InventoryItem item) {
        inventoryService.updateInventoryItem(item);
    }

    /** Deletes an inventory item by ID. */
    public boolean deleteInventoryItem(String id) {
        return inventoryService.deleteInventoryItem(id);
    }

    // Add more methods as needed for viewing, updating, deleting, and cross-service workflows.
} 