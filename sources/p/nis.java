package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class nis implements Update {
    public static final nis a = new nis();

    public final Next a(Object obj, Object obj2) {
        nzw0 nzw0Var = (nzw0) obj;
        kzw0 kzw0Var = (kzw0) obj2;
        boolean z = nzw0Var.h;
        String str = nzw0Var.f;
        String str2 = nzw0Var.e;
        boolean z2 = nzw0Var.i;
        if (kzw0Var.equals(tyw0.a)) {
            return Next.h(nzw0.a(nzw0Var, 2, null, null, false, false, false, 1015));
        }
        boolean zEquals = kzw0Var.equals(syw0.a);
        wzw0 wzw0Var = wzw0.c;
        if (zEquals) {
            return Next.a(Effects.a(new xxw0[]{new xxw0(wzw0Var)}));
        }
        if (kzw0Var instanceof oyw0) {
            return Next.h(nzw0.a(nzw0Var, 0, null, null, false, true, false, 895));
        }
        if (kzw0Var instanceof nyw0) {
            String str3 = ((nyw0) kzw0Var).a;
            return Next.h(nzw0.a(nzw0Var, 3, !u890.j(nzw0Var.b, str3) ? str3 : null, null, false, false, false, 871));
        }
        if (kzw0Var.equals(pyw0.a) || kzw0Var.equals(qyw0.a)) {
            return Next.a(Effects.a(new zxw0[]{zxw0.a}));
        }
        if (kzw0Var.equals(ryw0.a)) {
            return Next.h(nzw0.a(nzw0Var, 4, null, null, false, false, false, 1015));
        }
        if (kzw0Var.equals(yyw0.a)) {
            return Next.a(Effects.a(new ayw0[]{new ayw0(false)}));
        }
        boolean zEquals2 = kzw0Var.equals(zyw0.a);
        wxw0 wxw0Var = wxw0.a;
        if (zEquals2) {
            return Next.a(Effects.a(new wxw0[]{wxw0Var}));
        }
        if (kzw0Var instanceof wyw0) {
            int iC = l1d.C(((wyw0) kzw0Var).a);
            if (iC == 0) {
                return Next.i(nzw0.a(nzw0Var, 0, null, null, false, false, false, 767), Effects.a(new ayw0[]{new ayw0(true)}));
            }
            byw0 byw0Var = byw0.a;
            if (iC == 1) {
                return z2 ? Next.h(nzw0.a(nzw0Var, 0, null, null, false, false, false, 767)) : Next.a(Effects.a(new byw0[]{byw0Var}));
            }
            if (iC == 2) {
                return z2 ? Next.i(nzw0.a(nzw0Var, 0, null, null, false, false, false, 767), Effects.a(new dyw0[]{dyw0.a})) : Next.i(nzw0.a(nzw0Var, 0, null, null, false, false, true, 767), Effects.a(new byw0[]{byw0Var}));
            }
            eg.o();
            return null;
        }
        if (kzw0Var instanceof xyw0) {
            if (((xyw0) kzw0Var).a) {
                return Next.i(nzw0.a(nzw0Var, 0, null, null, false, false, false, 767), Effects.a(new ayw0[]{new ayw0(true)}));
            }
            return z2 ? Next.a(Effects.a(new wxw0[]{wxw0Var})) : Next.j();
        }
        if (kzw0Var.equals(vyw0.a)) {
            return Next.a(Effects.a(new yxw0[]{yxw0.a}));
        }
        if (kzw0Var.equals(uyw0.a)) {
            return Next.j();
        }
        if (kzw0Var instanceof bzw0) {
            return Next.h(nzw0.a(nzw0Var, 4, null, ((bzw0) kzw0Var).a, false, false, false, 983));
        }
        if (kzw0Var.equals(azw0.a)) {
            return Next.a(Effects.a(new eyw0[]{eyw0.a}));
        }
        if (kzw0Var.equals(izw0.a)) {
            return Next.h(nzw0.a(nzw0Var, 2, null, null, false, false, false, 1015));
        }
        if (kzw0Var.equals(jzw0.a)) {
            return (str2 == null && str == null && !z) ? Next.a(Effects.a(new xxw0[]{new xxw0(wzw0Var)})) : Next.a(Effects.a(new cyw0[]{new cyw0(str2, str)}));
        }
        if (kzw0Var.equals(fzw0.a)) {
            return Next.j();
        }
        if (kzw0Var.equals(gzw0.a)) {
            return Next.h(nzw0.a(nzw0Var, 0, null, null, true, false, false, 959));
        }
        if (kzw0Var.equals(ezw0.a)) {
            return Next.i(nzw0.a(nzw0Var, 0, null, null, false, false, false, 959), Effects.a(new gyw0[]{gyw0.a}));
        }
        if (kzw0Var.equals(hzw0.a)) {
            return Next.a(Effects.a(new xxw0[]{new xxw0(new wzw0(str2 != null, str != null))}));
        }
        if (kzw0Var.equals(czw0.a)) {
            return Next.j();
        }
        if (kzw0Var.equals(dzw0.a)) {
            return Next.a(Effects.a(new cyw0[]{new cyw0(str2, str)}));
        }
        if (!kzw0Var.equals(myw0.a)) {
            eg.o();
            return null;
        }
        int i = mzw0.a[l1d.C(nzw0Var.d)];
        vxw0 vxw0Var = vxw0.a;
        if (i == 1) {
            return Next.a(Effects.a(new vxw0[]{vxw0Var}));
        }
        return (str2 == null && str == null && !z) ? Next.a(Effects.a(new vxw0[]{vxw0Var})) : Next.a(Effects.a(new fyw0[]{new fyw0(nzw0Var.g)}));
    }
}
