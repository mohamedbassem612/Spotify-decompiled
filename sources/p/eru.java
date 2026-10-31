package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eru {
    public static final eru a;
    public static final eru b;
    public static final eru c;
    public static final eru d;
    public static final /* synthetic */ eru[] e;

    static {
        eru eruVar = new eru("Up", 0);
        a = eruVar;
        eru eruVar2 = new eru("Drag", 1);
        b = eruVar2;
        eru eruVar3 = new eru("Timeout", 2);
        c = eruVar3;
        eru eruVar4 = new eru("Cancel", 3);
        d = eruVar4;
        e = new eru[]{eruVar, eruVar2, eruVar3, eruVar4};
    }

    public static eru valueOf(String str) {
        return (eru) Enum.valueOf(eru.class, str);
    }

    public static eru[] values() {
        return (eru[]) e.clone();
    }
}
