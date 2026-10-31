package p;

import com.spotify.cosmos.cosmos.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a370 {
    public static final a370 a;
    public static final a370 b;
    public static final /* synthetic */ a370[] c;

    static {
        a370 a370Var = new a370(Request.GET, 0);
        a = a370Var;
        a370 a370Var2 = new a370(Request.POST, 1);
        b = a370Var2;
        c = new a370[]{a370Var, a370Var2, new a370(Request.DELETE, 2)};
    }

    public static a370 valueOf(String str) {
        return (a370) Enum.valueOf(a370.class, str);
    }

    public static a370[] values() {
        return (a370[]) c.clone();
    }
}
