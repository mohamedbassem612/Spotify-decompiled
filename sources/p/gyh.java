package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gyh {
    public static final gyh a;
    public static final gyh b;
    public static final gyh c;
    public static final gyh d;
    public static final gyh e;
    public static final /* synthetic */ gyh[] f;

    static {
        gyh gyhVar = new gyh("Autocomplete", 0);
        a = gyhVar;
        gyh gyhVar2 = new gyh("Submit", 1);
        b = gyhVar2;
        gyh gyhVar3 = new gyh("Deeplink", 2);
        c = gyhVar3;
        gyh gyhVar4 = new gyh("RecommendedQuery", 3);
        d = gyhVar4;
        gyh gyhVar5 = new gyh("RelatedQuery", 4);
        e = gyhVar5;
        f = new gyh[]{gyhVar, gyhVar2, gyhVar3, gyhVar4, gyhVar5};
    }

    public static gyh valueOf(String str) {
        return (gyh) Enum.valueOf(gyh.class, str);
    }

    public static gyh[] values() {
        return (gyh[]) f.clone();
    }
}
