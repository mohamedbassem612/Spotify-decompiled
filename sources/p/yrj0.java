package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yrj0 extends trj0 {
    public static final yrj0 d = new yrj0(0, 1, 2);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yrj0(byte b, int i, int i2) {
        super(i, i2);
        this.c = b;
    }

    @Override // p.trj0
    public final void a(sk30 sk30Var) {
        switch (this.c) {
            case 0:
                sk30Var.f("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                sk30Var.f("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                sk30Var.f("DROP TABLE IF EXISTS alarmInfo");
                sk30Var.f("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            default:
                sk30Var.f("ALTER TABLE device_ids ADD createdAt INTEGER");
                break;
        }
    }
}
