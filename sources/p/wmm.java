package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wmm implements qk90 {
    public final String a;
    public final t8p b;
    public final yd91 c = new yd91(3, new j3m(this, (byte) 8));
    public final vmm d = new vmm(this);

    public wmm(String str, t8p t8pVar) {
        this.a = str;
        this.b = t8pVar;
    }

    public static String e(xmm xmmVar, zmm zmmVar) {
        h290 h290Var = xmmVar != null ? xmmVar.a : null;
        if (h290Var == null) {
            h290Var = z6x.a;
        }
        if (o7h.i0((Iterable) h290Var, zmmVar != null ? zmmVar.c : null) && zmmVar != null) {
            String str = zmmVar.a;
            if (str.length() > 0) {
                return str;
            }
        }
        return null;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.d;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.c;
    }
}
