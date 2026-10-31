package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class trj0 {
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public trj0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public void a(sk30 sk30Var) throws jgo0 {
        throw new jgo0("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public void b(y341 y341Var) throws jgo0 {
        if (!(y341Var instanceof f1d1)) {
            throw new jgo0("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((f1d1) y341Var).a);
    }
}
