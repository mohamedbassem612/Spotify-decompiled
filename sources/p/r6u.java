package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6u {
    public static final r6u a;
    public static final r6u b;
    public static final /* synthetic */ r6u[] c;

    static {
        r6u r6uVar = new r6u("DiscardClicked", 0);
        a = r6uVar;
        r6u r6uVar2 = new r6u("KeepEditingClicked", 1);
        b = r6uVar2;
        c = new r6u[]{r6uVar, r6uVar2};
    }

    public static r6u valueOf(String str) {
        return (r6u) Enum.valueOf(r6u.class, str);
    }

    public static r6u[] values() {
        return (r6u[]) c.clone();
    }
}
