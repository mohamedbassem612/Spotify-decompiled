package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class psk {
    public static final psk a;
    public static final psk b;
    public static final psk c;
    public static final /* synthetic */ psk[] d;
    public static final /* synthetic */ t0z e;

    static {
        psk pskVar = new psk("VIEW", 0);
        a = pskVar;
        psk pskVar2 = new psk("NEW", 1);
        b = pskVar2;
        psk pskVar3 = new psk("EDIT", 2);
        c = pskVar3;
        psk[] pskVarArr = {pskVar, pskVar2, pskVar3};
        d = pskVarArr;
        e = new t0z(pskVarArr);
    }

    public static psk valueOf(String str) {
        return (psk) Enum.valueOf(psk.class, str);
    }

    public static psk[] values() {
        return (psk[]) d.clone();
    }
}
