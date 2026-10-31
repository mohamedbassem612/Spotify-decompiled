package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vyr implements hc10 {
    public static final int[] g = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final zfr h = new zfr(new ofr((byte) 3));
    public static final zfr i = new zfr(new ofr((byte) 4));
    public boolean a;
    public boolean b;
    public bg11 c;
    public sjb d = new sjb((byte) 7);
    public boolean e;
    public boolean f;

    public final void a(int i2, ArrayList arrayList) {
        switch (i2) {
            case 0:
                arrayList.add(new ta());
                break;
            case 1:
                arrayList.add(new va());
                break;
            case 2:
                arrayList.add(new p72(this.a ? 1 : 0));
                break;
            case 3:
                arrayList.add(new mz3(this.b ? 1 : 0));
                break;
            case 4:
                ec10 ec10VarK = h.k(new Object[]{0});
                if (ec10VarK == null) {
                    arrayList.add(new vn20());
                } else {
                    arrayList.add(ec10VarK);
                }
                break;
            case 5:
                arrayList.add(new uw20());
                break;
            case 6:
                arrayList.add(new rch0(this.d, 0));
                break;
            case 7:
                arrayList.add(new ipm0(0));
                break;
            case 8:
                sjb sjbVar = this.d;
                int iF = pj30.f(3) | 512;
                w280 w280Var = b380.b;
                arrayList.add(new pj30(sjbVar, iF, null, bg11.e));
                arrayList.add(new qpm0(this.d, 0 | 160));
                break;
            case 9:
                arrayList.add(new oyp0());
                break;
            case 10:
                arrayList.add(new dmy0());
                break;
            case 11:
                if (this.c == null) {
                    w280 w280Var2 = b380.b;
                    this.c = bg11.e;
                }
                arrayList.add(new uwg1(1, 0, this.d, new yve1(0L), new yxs(0, this.c)));
                break;
            case 12:
                arrayList.add(new cdl1());
                break;
            case 14:
                arrayList.add(new b660(this.e ? 1 : 0, (byte) 1));
                break;
            case 15:
                ec10 ec10VarK2 = i.k(new Object[0]);
                if (ec10VarK2 != null) {
                    arrayList.add(ec10VarK2);
                }
                break;
            case 16:
                arrayList.add(new dc9(0, this.d));
                break;
            case 17:
                arrayList.add(new ukb((byte) 1));
                break;
            case 18:
                arrayList.add(new gc9((byte) 1));
                break;
            case 19:
                arrayList.add(new ukb((byte) 0));
                break;
            case 20:
                arrayList.add(new b660(this.f ? 1 : 0, (byte) 0));
                break;
            case 21:
                arrayList.add(new gc9((byte) 0));
                break;
        }
    }

    @Override // p.hc10
    public final synchronized ec10[] c(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = g;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iY = jhc1.y((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iY != -1) {
                a(iY, arrayList);
            }
            int iZ = jhc1.z(uri);
            if (iZ != -1 && iZ != iY) {
                a(iZ, arrayList);
            }
            for (int i2 = 0; i2 < 21; i2++) {
                int i3 = iArr[i2];
                if (i3 != iY && i3 != iZ) {
                    a(i3, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ec10[]) arrayList.toArray(new ec10[0]);
    }

    @Override // p.hc10
    public final synchronized ec10[] g() {
        return c(Uri.EMPTY, new HashMap());
    }
}
