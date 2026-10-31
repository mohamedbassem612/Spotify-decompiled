package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qax {
    public static final qax X;
    public static final qax Y;
    public static final /* synthetic */ qax[] Z;
    public static final qax a;
    public static final qax b;
    public static final qax c;
    public static final qax d;
    public static final qax e;
    public static final qax f;
    public static final qax g;
    public static final qax h;
    public static final qax i;
    public static final qax t;

    static {
        qax qaxVar = new qax("ERROR_CORRECTION", 0);
        a = qaxVar;
        qax qaxVar2 = new qax("CHARACTER_SET", 1);
        b = qaxVar2;
        qax qaxVar3 = new qax("DATA_MATRIX_SHAPE", 2);
        c = qaxVar3;
        qax qaxVar4 = new qax("MIN_SIZE", 3);
        d = qaxVar4;
        qax qaxVar5 = new qax("MAX_SIZE", 4);
        e = qaxVar5;
        qax qaxVar6 = new qax("MARGIN", 5);
        f = qaxVar6;
        qax qaxVar7 = new qax("PDF417_COMPACT", 6);
        g = qaxVar7;
        qax qaxVar8 = new qax("PDF417_COMPACTION", 7);
        h = qaxVar8;
        qax qaxVar9 = new qax("PDF417_DIMENSIONS", 8);
        i = qaxVar9;
        qax qaxVar10 = new qax("AZTEC_LAYERS", 9);
        t = qaxVar10;
        qax qaxVar11 = new qax("QR_VERSION", 10);
        X = qaxVar11;
        qax qaxVar12 = new qax("GS1_FORMAT", 11);
        Y = qaxVar12;
        Z = new qax[]{qaxVar, qaxVar2, qaxVar3, qaxVar4, qaxVar5, qaxVar6, qaxVar7, qaxVar8, qaxVar9, qaxVar10, qaxVar11, qaxVar12};
    }

    public static qax valueOf(String str) {
        return (qax) Enum.valueOf(qax.class, str);
    }

    public static qax[] values() {
        return (qax[]) Z.clone();
    }
}
