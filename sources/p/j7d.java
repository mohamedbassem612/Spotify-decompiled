package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j7d {
    public static final j7d a;
    public static final j7d b;
    public static final j7d c;
    public static final j7d d;
    public static final /* synthetic */ j7d[] e;

    static {
        j7d j7dVar = new j7d("AGE_ASSURANCE_REQUIRED", 0);
        a = j7dVar;
        j7d j7dVar2 = new j7d("UNDERAGE", 1);
        b = j7dVar2;
        j7d j7dVar3 = new j7d("VERIFIED", 2);
        c = j7dVar3;
        j7d j7dVar4 = new j7d("UNKNOWN", 3);
        d = j7dVar4;
        e = new j7d[]{j7dVar, j7dVar2, j7dVar3, j7dVar4};
    }

    public static j7d valueOf(String str) {
        return (j7d) Enum.valueOf(j7d.class, str);
    }

    public static j7d[] values() {
        return (j7d[]) e.clone();
    }
}
