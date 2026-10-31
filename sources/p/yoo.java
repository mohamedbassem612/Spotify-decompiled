package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yoo {
    public static final yoo a;
    public static final yoo b;
    public static final yoo c;
    public static final /* synthetic */ yoo[] d;

    static {
        yoo yooVar = new yoo("ADD", 0);
        a = yooVar;
        yoo yooVar2 = new yoo("MOVE", 1);
        b = yooVar2;
        yoo yooVar3 = new yoo("REMOVE", 2);
        c = yooVar3;
        d = new yoo[]{yooVar, yooVar2, yooVar3};
    }

    public static yoo valueOf(String str) {
        return (yoo) Enum.valueOf(yoo.class, str);
    }

    public static yoo[] values() {
        return (yoo[]) d.clone();
    }
}
