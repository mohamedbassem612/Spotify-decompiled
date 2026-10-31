package p;

import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.geometry.Offset;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n93 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(jti0 jti0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 6;
        this.b = jti0Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                n93 n93Var = new n93(obj6, obj5, obj4, (lnm) obj3, (byte) 0);
                n93Var.b = (Boolean) obj;
                n93Var.c = (Map) obj2;
                return n93Var.invokeSuspend(rih1Var);
            case 1:
                n93 n93Var2 = new n93(obj6, obj5, obj4, (lnm) obj3, (byte) 1);
                n93Var2.b = (k1r) obj;
                n93Var2.c = (k1r) obj2;
                return n93Var2.invokeSuspend(rih1Var);
            case 2:
                n93 n93Var3 = new n93((p1f0) this.c, (Uri) obj6, (String) obj5, (ParcelFileDescriptor[]) obj4, (lnm) obj3);
                n93Var3.b = (Throwable) obj2;
                n93Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                n93 n93Var4 = new n93(obj6, obj5, obj4, (lnm) obj3, (byte) 3);
                n93Var4.b = (cxc0) obj;
                n93Var4.c = (v6y0) obj2;
                return n93Var4.invokeSuspend(rih1Var);
            case 4:
                n93 n93Var5 = new n93(obj6, obj5, obj4, (lnm) obj3, (byte) 4);
                n93Var5.b = (s4b1) obj;
                n93Var5.c = (String) obj2;
                return n93Var5.invokeSuspend(rih1Var);
            case 5:
                n93 n93Var6 = new n93((w221) obj6, (hti0) obj4, (qxc0) obj5, (lnm) obj3);
                n93Var6.b = (c221) obj;
                n93Var6.c = (Map) obj2;
                return n93Var6.invokeSuspend(rih1Var);
            default:
                long j = ((Offset) obj2).a;
                new n93((jti0) this.b, (ven0) this.c, (ven0) obj6, (ven0) obj5, (ven0) obj4, (lnm) obj3).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        up70 up70VarA2;
        mq70 mq70Var2;
        up70 up70VarA3;
        List list;
        ho70 ho70Var;
        String str2;
        xkk1 xkk1Var;
        mq70 mq70Var3;
        up70 up70VarA4;
        String string;
        byte b = this.a;
        String str3 = "";
        rih1 rih1Var = rih1.a;
        String str4 = null;
        boolean z = false;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) this.b;
                Map map = (Map) this.c;
                hm5.M(obj);
                String str5 = ((hti0) obj2).a;
                bool.getClass();
                return ((o93) obj3).f((qxc0) obj4, str5, bool.booleanValue(), map);
            case 1:
                String str6 = (String) obj3;
                i1r i1rVar = (k1r) this.b;
                i1r i1rVar2 = (k1r) this.c;
                hm5.M(obj);
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                String str7 = (i1rVar3 == null || (xkk1Var = (xkk1) i1rVar3.a) == null || (mq70Var3 = xkk1Var.a) == null || (up70VarA4 = mq70Var3.a(vp70.b)) == null) ? null : up70VarA4.a.a;
                if (!(i1rVar instanceof i1r)) {
                    return e7w.a;
                }
                g1g1 g1g1Var = (g1g1) i1rVar.a;
                jo70 jo70Var = g1g1Var.a;
                xkk1 xkk1Var2 = g1g1Var.b;
                if (jo70Var != null && (str2 = jo70Var.a) != null && str2.length() != 0) {
                    str6 = str2;
                }
                String str8 = str6;
                jo70 jo70Var2 = g1g1Var.a;
                String str9 = (jo70Var2 == null || (list = jo70Var2.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) ? null : ho70Var.a;
                String str10 = str9 == null ? "" : str9;
                String str11 = (String) obj4;
                String str12 = (String) obj2;
                String str13 = (xkk1Var2 == null || (mq70Var2 = xkk1Var2.a) == null || (up70VarA3 = mq70Var2.a(vp70.c)) == null) ? null : up70VarA3.a.a;
                mq70 mq70Var4 = xkk1Var2 != null ? xkk1Var2.e : null;
                vp70 vp70Var = vp70.e;
                String str14 = (mq70Var4 == null || (up70VarA2 = mq70Var4.a(vp70Var)) == null) ? null : up70VarA2.a.a;
                if (str14 == null) {
                    if (xkk1Var2 != null && (mq70Var = xkk1Var2.a) != null && (up70VarA = mq70Var.a(vp70Var)) != null) {
                        str4 = up70VarA.a.a;
                    }
                    str = str4;
                } else {
                    str = str14;
                }
                return new d7w(str11, str8, str10, str12, str13, str, str7);
            case 2:
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                Logger.e(th, "Exception while trying to load the image.", new Object[0]);
                j2e0 j2e0Var = (j2e0) ((p1f0) this.c).f;
                Uri uri = (Uri) obj3;
                String str15 = (String) obj4;
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                j2e0Var.p(uri.toString(), str15, message);
                ((ParcelFileDescriptor[]) obj2)[1].closeWithError("network error");
                return rih1Var;
            case 3:
                cxc0 cxc0Var = (cxc0) this.b;
                v6y0 v6y0Var = (v6y0) this.c;
                hm5.M(obj);
                Map map2 = cxc0Var.f.q;
                Set set = h4d0.a;
                String str16 = (String) map2.get("generation_status");
                if (str16 != null && (string = ihc1.e1(str16).toString()) != null) {
                    str3 = string;
                }
                h4d0 h4d0VarU = qyo1.u(str3);
                if (((rg4) obj3).f() && ((i5y0) obj4).d() && !cxc0Var.a()) {
                    h4d0VarU.getClass();
                    if (h4d0.a.contains(h4d0VarU) || v6y0Var != null) {
                        z = true;
                    }
                }
                return new mot0(z, ((xyl1) ((qpj1) ((rb3) obj2).d).c).a(cxc0Var.f.q));
            case 4:
                s4b1 s4b1Var = (s4b1) this.b;
                String str17 = (String) this.c;
                hm5.M(obj);
                return ((k4v0) obj3).e(str17, str17, (Intent) obj4, (th61) obj2, s4b1Var);
            case 5:
                c221 c221Var = (c221) this.b;
                Map map3 = (Map) this.c;
                hm5.M(obj);
                c221Var.getClass();
                return ((w221) obj3).d(((hti0) obj2).a, (qxc0) obj4, c221Var, map3);
            default:
                jti0 jti0Var = (jti0) this.b;
                ven0 ven0Var = (ven0) obj4;
                ven0 ven0Var2 = (ven0) obj3;
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) this.c;
                faa0 faa0Var = (faa0) ven0Var3.getValue();
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ven0Var3.setValue((Object) null);
                faa0 faa0Var2 = (faa0) ven0Var2.getValue();
                if (faa0Var2 != null) {
                    faa0Var2.d((CancellationException) null);
                }
                ven0Var2.setValue((Object) null);
                faa0 faa0Var3 = (faa0) ven0Var.getValue();
                if (faa0Var3 != null) {
                    faa0Var3.d((CancellationException) null);
                }
                ven0Var.setValue((Object) null);
                ((ven0) obj2).setValue(Boolean.TRUE);
                jti0Var.f(false);
                jti0Var.d(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(p1f0 p1f0Var, Uri uri, String str, ParcelFileDescriptor[] parcelFileDescriptorArr, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.c = p1f0Var;
        this.d = uri;
        this.e = str;
        this.f = parcelFileDescriptorArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n93(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(w221 w221Var, hti0 hti0Var, qxc0 qxc0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 5;
        this.d = w221Var;
        this.f = hti0Var;
        this.e = qxc0Var;
    }
}
