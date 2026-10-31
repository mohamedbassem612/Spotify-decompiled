package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bvx {
    public static final bvx a;
    public static final bvx b;
    public static final /* synthetic */ bvx[] c;

    static {
        bvx bvxVar = new bvx("Configuration", 0);
        a = bvxVar;
        bvx bvxVar2 = new bvx("Explicit", 1);
        b = bvxVar2;
        c = new bvx[]{bvxVar, bvxVar2};
    }

    public static bvx valueOf(String str) {
        return (bvx) Enum.valueOf(bvx.class, str);
    }

    public static bvx[] values() {
        return (bvx[]) c.clone();
    }
}
