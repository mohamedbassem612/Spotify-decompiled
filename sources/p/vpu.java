package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vpu {
    public static final vpu a;
    public static final vpu b;
    public static final /* synthetic */ vpu[] c;

    static {
        vpu vpuVar = new vpu("DOCKED", 0);
        a = vpuVar;
        vpu vpuVar2 = new vpu("NOT_DOCKED", 1);
        b = vpuVar2;
        c = new vpu[]{vpuVar, vpuVar2};
    }

    public static vpu valueOf(String str) {
        return (vpu) Enum.valueOf(vpu.class, str);
    }

    public static vpu[] values() {
        return (vpu[]) c.clone();
    }
}
