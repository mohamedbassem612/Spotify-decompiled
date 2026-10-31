package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zig {
    public static final zig a;
    public static final /* synthetic */ zig[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zig EF0;

    static {
        zig zigVar = new zig("UNKNOWN", 0);
        zig zigVar2 = new zig("ANDROID_FIREBASE", 1);
        a = zigVar2;
        b = new zig[]{zigVar, zigVar2};
    }

    public static zig valueOf(String str) {
        return (zig) Enum.valueOf(zig.class, str);
    }

    public static zig[] values() {
        return (zig[]) b.clone();
    }
}
