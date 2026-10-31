package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class baz {
    public static final /* synthetic */ baz[] a = {new baz("Music", 0), new baz("None", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    baz EF5;

    public static baz valueOf(String str) {
        return (baz) Enum.valueOf(baz.class, str);
    }

    public static baz[] values() {
        return (baz[]) a.clone();
    }
}
