package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class izm0 implements bbr0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public izm0() {
        this.a = (byte) 1;
        this.b = new kdn0((Object) null);
        this.c = new LinkedHashMap();
    }

    public final war0 b0(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new cbr0(new dbr0[]{new bn70(((o6r0) obj).e(), ((jik1) obj2).getViewUri(), (nar0) null)}, false).b0(cls);
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                Object mzb1Var = linkedHashMap.get(cls);
                if (mzb1Var == null) {
                    mzb1Var = new mzb1((kdn0) obj, cls);
                    linkedHashMap.put(cls, mzb1Var);
                }
                return (war0) mzb1Var;
        }
    }

    public izm0(o6r0 o6r0Var, jik1 jik1Var) {
        this.a = (byte) 0;
        this.b = o6r0Var;
        this.c = jik1Var;
    }
}
