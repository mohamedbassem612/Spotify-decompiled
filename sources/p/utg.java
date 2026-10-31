package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class utg implements Runnable {
    public final /* synthetic */ double X;
    public final /* synthetic */ wtg a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ int g;
    public final /* synthetic */ double h;
    public final /* synthetic */ int i;
    public final /* synthetic */ double t;

    public utg(wtg wtgVar, String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int i, double d, int i2, double d2, double d3) {
        this.a = wtgVar;
        this.b = str;
        this.c = str2;
        this.d = iArr;
        this.e = iArr2;
        this.f = strArr;
        this.g = i;
        this.h = d;
        this.i = i2;
        this.t = d2;
        this.X = d3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zsg zsgVar;
        if (this.a.Y || !this.a.f.containsKey(this.b)) {
            return;
        }
        lag lagVar = this.a.e;
        String str = this.b;
        String str2 = this.c;
        int[] iArr = this.d;
        int[] iArr2 = this.e;
        String[] strArr = this.f;
        int i = this.g;
        double d = this.h;
        int i2 = this.i;
        double d2 = this.t;
        double d3 = this.X;
        jtg jtgVar = (jtg) lagVar.b;
        if (jtgVar.b.containsKey(str)) {
            if (str2 == null) {
                zsgVar = null;
            } else {
                zsgVar = new zsg(str2, iArr, iArr2, strArr, new atg((ysg) o7h.t0(i, ysg.b), !Double.isNaN(d) ? Double.valueOf(d) : null, i2 == Integer.MIN_VALUE ? null : Integer.valueOf(i2), !Double.isNaN(d2) ? Double.valueOf(d2) : null, !Double.isNaN(d3) ? Double.valueOf(d3) : null));
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) lagVar.e;
            if (zsgVar != null) {
                linkedHashMap.put(str, zsgVar);
            } else {
                linkedHashMap.remove(str);
            }
            if (u890.j(((gtg) jtgVar.d.a.getValue()).a, str)) {
                lagVar.s(str);
            }
        }
    }
}
