package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d1z {
    public static final d1z a;
    public static final d1z b;
    public static final d1z c;
    public static final d1z d;
    public static final /* synthetic */ d1z[] e;

    static {
        d1z d1zVar = new d1z("VODCAST", 0);
        a = d1zVar;
        d1z d1zVar2 = new d1z("AUDIO", 1);
        b = d1zVar2;
        d1z d1zVar3 = new d1z("VIDEO", 2);
        c = d1zVar3;
        d1z d1zVar4 = new d1z("UNKNOWN", 3);
        d = d1zVar4;
        e = new d1z[]{d1zVar, d1zVar2, d1zVar3, d1zVar4};
        values();
    }

    public static d1z valueOf(String str) {
        return (d1z) Enum.valueOf(d1z.class, str);
    }

    public static d1z[] values() {
        return (d1z[]) e.clone();
    }
}
