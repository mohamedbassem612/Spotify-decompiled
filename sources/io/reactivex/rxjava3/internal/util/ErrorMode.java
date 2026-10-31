package io.reactivex.rxjava3.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ErrorMode {
    public static final ErrorMode a;
    public static final ErrorMode b;
    public static final ErrorMode c;
    public static final /* synthetic */ ErrorMode[] d;

    static {
        ErrorMode errorMode = new ErrorMode("IMMEDIATE", 0);
        a = errorMode;
        ErrorMode errorMode2 = new ErrorMode("BOUNDARY", 1);
        b = errorMode2;
        ErrorMode errorMode3 = new ErrorMode("END", 2);
        c = errorMode3;
        d = new ErrorMode[]{errorMode, errorMode2, errorMode3};
    }

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) d.clone();
    }
}
