package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oim1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ njx0 b;
    public final /* synthetic */ py7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oim1(py7 py7Var, njx0 njx0Var) {
        super(1);
        this.c = py7Var;
        this.b = njx0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        py7 py7Var = this.c;
        njx0 njx0Var = this.b;
        switch (b) {
            case 0:
                qia qiaVar = (qia) py7Var.b.get((String) obj);
                if (qiaVar == null) {
                    qiaVar = new qia(z6x.a, 0.0f, 6);
                }
                return new jia(qiaVar, njx0Var, new nim1(py7Var, (byte) 0));
            default:
                return new jia((qia) obj, njx0Var, new nim1(py7Var, (byte) 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oim1(njx0 njx0Var, py7 py7Var) {
        super(1);
        this.b = njx0Var;
        this.c = py7Var;
    }
}
