package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gic extends aic {
    public static gic n(String str) {
        gic gicVar = new gic(str.toCharArray());
        gicVar.b = 0L;
        gicVar.l(str.length() - 1);
        return gicVar;
    }

    @Override // p.aic
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gic) && d().equals(((gic) obj).d())) {
            return true;
        }
        return super.equals(obj);
    }
}
