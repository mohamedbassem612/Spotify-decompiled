package p;

import android.app.Activity;
import android.graphics.Bitmap;
import com.spotify.fandomcollectibles.protos.FanStampCardStory;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y8c1 extends a8d1 implements xu30 {
    public final /* synthetic */ FanStampCardStory N0;
    public final /* synthetic */ String O0;
    public byte X;
    public /* synthetic */ sj41 Y;
    public /* synthetic */ f8c1 Z;
    public Object[] a;
    public zda[] b;
    public Object c;
    public Object d;
    public Object e;
    public Object[] f;
    public sk41 g;
    public zda[] h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8c1(FanStampCardStory fanStampCardStory, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.N0 = fanStampCardStory;
        this.O0 = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y8c1 y8c1Var = new y8c1(this.N0, this.O0, (lnm) obj3);
        y8c1Var.Y = (sj41) obj;
        y8c1Var.Z = (f8c1) obj2;
        return y8c1Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0167  */
    /* JADX WARN: Code duplicated, block: B:28:0x017a  */
    /* JADX WARN: Code duplicated, block: B:41:0x01dd  */
    public final Object invokeSuspend(Object obj) {
        vk41[] vk41VarArr;
        Object objU;
        sk41 sk41Var;
        zda[] zdaVarArr;
        zda[] zdaVarArr2;
        int i;
        int i2;
        vk41[] vk41VarArr2;
        Object objU2;
        zda[] zdaVarArr3;
        sk41 sk41Var2;
        int i3;
        vk41[] vk41VarArr3;
        vk41[] vk41VarArr4;
        zda[] zdaVarArr4;
        int i4;
        Bitmap bitmap;
        Object objU3;
        Bitmap bitmap2;
        int i5;
        zda[] zdaVarArr5;
        vk41[] vk41VarArr5;
        Bitmap bitmap3;
        String strY;
        String strT;
        FanStampCardStory fanStampCardStory;
        Bitmap bitmap4;
        String str;
        Bitmap bitmap5;
        Object objU4;
        Bitmap bitmap6;
        String str2;
        String strO;
        List listQ0;
        sj41 sj41Var = this.Y;
        f8c1 f8c1Var = this.Z;
        byte b = this.X;
        sk41 sk41Var3 = sk41.a;
        FanStampCardStory fanStampCardStory2 = this.N0;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            mmr0 mmr0VarP = dio1.p(fanStampCardStory2.x(), this.O0, fanStampCardStory2.p().o());
            iy61 iy61Var = (iy61) mmr0VarP.a;
            fy61 fy61Var = (fy61) mmr0VarP.b;
            sj41Var.b = iy61Var;
            sj41Var.a = fy61Var;
            vk41VarArr = new vk41[2];
            zda[] zdaVarArr6 = new zda[1];
            gw70 gw70Var = f8c1Var.c;
            String strZ = fanStampCardStory2.z();
            this.Y = null;
            this.Z = f8c1Var;
            this.a = vk41VarArr;
            this.b = zdaVarArr6;
            this.c = vk41VarArr;
            this.d = sk41Var3;
            this.e = zdaVarArr6;
            this.i = 0;
            this.t = 0;
            this.X = (byte) 1;
            objU = who1.u(strZ, this, gw70Var);
            if (objU != d9nVar) {
                sk41Var = sk41Var3;
                zdaVarArr = zdaVarArr6;
                zdaVarArr2 = zdaVarArr;
                i = 0;
                i2 = 0;
                vk41VarArr2 = vk41VarArr;
            }
            return d9nVar;
        }
        if (b == 1) {
            int i6 = this.t;
            int i7 = this.i;
            zda[] zdaVarArr7 = (zda[]) this.e;
            sk41Var = (sk41) this.d;
            vk41[] vk41VarArr6 = (vk41[]) this.c;
            zda[] zdaVarArr8 = this.b;
            vk41[] vk41VarArr7 = (vk41[]) this.a;
            hm5.M(obj);
            zdaVarArr2 = zdaVarArr8;
            vk41VarArr2 = vk41VarArr6;
            vk41VarArr = vk41VarArr7;
            zdaVarArr = zdaVarArr7;
            i2 = i7;
            i = i6;
            objU = obj;
        } else {
            if (b == 2) {
                i4 = this.t;
                int i8 = this.i;
                zda[] zdaVarArr9 = (zda[]) this.e;
                sk41Var2 = (sk41) this.d;
                vk41VarArr3 = (vk41[]) this.c;
                zdaVarArr4 = this.b;
                vk41VarArr4 = (vk41[]) this.a;
                hm5.M(obj);
                zdaVarArr3 = zdaVarArr9;
                i3 = i8;
                objU2 = obj;
                bitmap = (Bitmap) objU2;
                gw70 gw70Var2 = f8c1Var.c;
                String strW = fanStampCardStory2.w();
                this.Y = null;
                this.Z = f8c1Var;
                this.a = vk41VarArr4;
                this.b = zdaVarArr4;
                this.c = bitmap;
                this.d = vk41VarArr3;
                this.e = sk41Var2;
                this.f = zdaVarArr3;
                this.i = i3;
                this.t = i4;
                this.X = (byte) 3;
                objU3 = who1.u(strW, this, gw70Var2);
                if (objU3 != d9nVar) {
                    vk41[] vk41VarArr8 = vk41VarArr3;
                    bitmap2 = bitmap;
                    i5 = i3;
                    zdaVarArr5 = zdaVarArr3;
                    vk41VarArr5 = vk41VarArr8;
                    bitmap3 = (Bitmap) objU3;
                    strY = fanStampCardStory2.y();
                    strT = fanStampCardStory2.t();
                    if (strT == null) {
                    }
                    fanStampCardStory = fanStampCardStory2;
                    bitmap4 = bitmap3;
                    str = strY;
                    bitmap5 = null;
                    Bitmap bitmap7 = bitmap2;
                    strO = fanStampCardStory.r().o();
                    listQ0 = ihc1.Q0(strO, new String[]{" "}, 0, 6);
                    if (listQ0.size() > 1) {
                        int size = listQ0.size() / 2;
                        List list = listQ0;
                        strO = f4i1.f(o7h.y0(o7h.d1(list, size), " ", (String) null, (String) null, (iu30) null, 62), "\n", o7h.y0(o7h.k0(list, size), " ", (String) null, (String) null, (iu30) null, 62));
                    }
                    String strP = fanStampCardStory.r().p();
                    Activity activity = f8c1Var.a;
                    zdaVarArr5[i4] = new zk10(bitmap7, bitmap4, str, bitmap5, who1.y(jon1.p(2132018010, activity), strO, strP), who1.y(jon1.p(2132018007, activity), fanStampCardStory.q().o(), fanStampCardStory.q().p()), who1.y(jon1.p(2132018006, activity), fanStampCardStory.n().o(), fanStampCardStory.n().p()), who1.y(jon1.p(2132018003, activity), fanStampCardStory.v().o(), fanStampCardStory.v().p()), who1.y(jon1.p(2132018006, activity), fanStampCardStory.u().o(), fanStampCardStory.u().p()), who1.y(jon1.p(2132018004, activity), fanStampCardStory.A().o(), fanStampCardStory.A().p()), fanStampCardStory.p().o(), fanStampCardStory.p().s(), f8c1Var.i.a, !f8c1Var.e);
                    sk41Var2.getClass();
                    vk41VarArr5[i5] = sk41.a(zdaVarArr4);
                    return p7h.M(vk41VarArr4);
                }
                return d9nVar;
            }
            if (b == 3) {
                i4 = this.t;
                i5 = this.i;
                zdaVarArr5 = (zda[]) this.f;
                sk41 sk41Var4 = (sk41) this.e;
                vk41[] vk41VarArr9 = (vk41[]) this.d;
                Bitmap bitmap8 = (Bitmap) this.c;
                zda[] zdaVarArr10 = this.b;
                vk41[] vk41VarArr10 = (vk41[]) this.a;
                hm5.M(obj);
                vk41VarArr4 = vk41VarArr10;
                sk41Var2 = sk41Var4;
                vk41VarArr5 = vk41VarArr9;
                bitmap2 = bitmap8;
                zdaVarArr4 = zdaVarArr10;
                objU3 = obj;
                bitmap3 = (Bitmap) objU3;
                strY = fanStampCardStory2.y();
                strT = fanStampCardStory2.t();
                if (strT == null && strT.length() != 0) {
                    gw70 gw70Var3 = f8c1Var.c;
                    fanStampCardStory = fanStampCardStory2;
                    String strT2 = fanStampCardStory.t();
                    this.Y = null;
                    this.Z = f8c1Var;
                    this.a = vk41VarArr4;
                    this.b = zdaVarArr4;
                    this.c = bitmap2;
                    this.d = bitmap3;
                    this.e = strY;
                    this.f = vk41VarArr5;
                    this.g = sk41Var2;
                    this.h = zdaVarArr5;
                    this.i = i5;
                    this.t = i4;
                    this.X = (byte) 4;
                    objU4 = who1.u(strT2, this, gw70Var3);
                    if (objU4 != d9nVar) {
                        bitmap6 = bitmap3;
                        str2 = strY;
                    }
                    return d9nVar;
                }
                fanStampCardStory = fanStampCardStory2;
                bitmap4 = bitmap3;
                str = strY;
                bitmap5 = null;
                Bitmap bitmap9 = bitmap2;
                strO = fanStampCardStory.r().o();
                listQ0 = ihc1.Q0(strO, new String[]{" "}, 0, 6);
                if (listQ0.size() > 1) {
                    int size2 = listQ0.size() / 2;
                    List list2 = listQ0;
                    strO = f4i1.f(o7h.y0(o7h.d1(list2, size2), " ", (String) null, (String) null, (iu30) null, 62), "\n", o7h.y0(o7h.k0(list2, size2), " ", (String) null, (String) null, (iu30) null, 62));
                }
                String strP2 = fanStampCardStory.r().p();
                Activity activity2 = f8c1Var.a;
                zdaVarArr5[i4] = new zk10(bitmap9, bitmap4, str, bitmap5, who1.y(jon1.p(2132018010, activity2), strO, strP2), who1.y(jon1.p(2132018007, activity2), fanStampCardStory.q().o(), fanStampCardStory.q().p()), who1.y(jon1.p(2132018006, activity2), fanStampCardStory.n().o(), fanStampCardStory.n().p()), who1.y(jon1.p(2132018003, activity2), fanStampCardStory.v().o(), fanStampCardStory.v().p()), who1.y(jon1.p(2132018006, activity2), fanStampCardStory.u().o(), fanStampCardStory.u().p()), who1.y(jon1.p(2132018004, activity2), fanStampCardStory.A().o(), fanStampCardStory.A().p()), fanStampCardStory.p().o(), fanStampCardStory.p().s(), f8c1Var.i.a, !f8c1Var.e);
                sk41Var2.getClass();
                vk41VarArr5[i5] = sk41.a(zdaVarArr4);
                return p7h.M(vk41VarArr4);
            }
            if (b != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = this.t;
            i5 = this.i;
            zdaVarArr5 = this.h;
            sk41Var2 = this.g;
            vk41VarArr5 = (vk41[]) this.f;
            str2 = (String) this.e;
            bitmap6 = (Bitmap) this.d;
            bitmap2 = (Bitmap) this.c;
            zdaVarArr4 = this.b;
            vk41[] vk41VarArr11 = (vk41[]) this.a;
            hm5.M(obj);
            vk41VarArr4 = vk41VarArr11;
            fanStampCardStory = fanStampCardStory2;
            objU4 = obj;
        }
        bitmap5 = (Bitmap) objU4;
        str = str2;
        bitmap4 = bitmap6;
        Bitmap bitmap10 = bitmap2;
        strO = fanStampCardStory.r().o();
        listQ0 = ihc1.Q0(strO, new String[]{" "}, 0, 6);
        if (listQ0.size() > 1) {
            int size3 = listQ0.size() / 2;
            List list3 = listQ0;
            strO = f4i1.f(o7h.y0(o7h.d1(list3, size3), " ", (String) null, (String) null, (iu30) null, 62), "\n", o7h.y0(o7h.k0(list3, size3), " ", (String) null, (String) null, (iu30) null, 62));
        }
        String strP3 = fanStampCardStory.r().p();
        Activity activity3 = f8c1Var.a;
        zdaVarArr5[i4] = new zk10(bitmap10, bitmap4, str, bitmap5, who1.y(jon1.p(2132018010, activity3), strO, strP3), who1.y(jon1.p(2132018007, activity3), fanStampCardStory.q().o(), fanStampCardStory.q().p()), who1.y(jon1.p(2132018006, activity3), fanStampCardStory.n().o(), fanStampCardStory.n().p()), who1.y(jon1.p(2132018003, activity3), fanStampCardStory.v().o(), fanStampCardStory.v().p()), who1.y(jon1.p(2132018006, activity3), fanStampCardStory.u().o(), fanStampCardStory.u().p()), who1.y(jon1.p(2132018004, activity3), fanStampCardStory.A().o(), fanStampCardStory.A().p()), fanStampCardStory.p().o(), fanStampCardStory.p().s(), f8c1Var.i.a, !f8c1Var.e);
        sk41Var2.getClass();
        vk41VarArr5[i5] = sk41.a(zdaVarArr4);
        return p7h.M(vk41VarArr4);
        zdaVarArr[i] = new qy9((Bitmap) objU, (byte) 0);
        sk41Var.getClass();
        vk41VarArr2[i2] = sk41.a(zdaVarArr2);
        zda[] zdaVarArr11 = new zda[1];
        gw70 gw70Var4 = f8c1Var.c;
        String strO2 = fanStampCardStory2.o();
        this.Y = null;
        this.Z = f8c1Var;
        this.a = vk41VarArr;
        this.b = zdaVarArr11;
        this.c = vk41VarArr;
        this.d = sk41Var3;
        this.e = zdaVarArr11;
        this.i = 1;
        this.t = 0;
        this.X = (byte) 2;
        objU2 = who1.u(strO2, this, gw70Var4);
        if (objU2 != d9nVar) {
            zdaVarArr3 = zdaVarArr11;
            sk41Var2 = sk41Var3;
            i3 = 1;
            vk41VarArr3 = vk41VarArr;
            vk41VarArr4 = vk41VarArr3;
            zdaVarArr4 = zdaVarArr3;
            i4 = 0;
            bitmap = (Bitmap) objU2;
            gw70 gw70Var5 = f8c1Var.c;
            String strW2 = fanStampCardStory2.w();
            this.Y = null;
            this.Z = f8c1Var;
            this.a = vk41VarArr4;
            this.b = zdaVarArr4;
            this.c = bitmap;
            this.d = vk41VarArr3;
            this.e = sk41Var2;
            this.f = zdaVarArr3;
            this.i = i3;
            this.t = i4;
            this.X = (byte) 3;
            objU3 = who1.u(strW2, this, gw70Var5);
            if (objU3 != d9nVar) {
                vk41[] vk41VarArr12 = vk41VarArr3;
                bitmap2 = bitmap;
                i5 = i3;
                zdaVarArr5 = zdaVarArr3;
                vk41VarArr5 = vk41VarArr12;
                bitmap3 = (Bitmap) objU3;
                strY = fanStampCardStory2.y();
                strT = fanStampCardStory2.t();
                if (strT == null) {
                }
                fanStampCardStory = fanStampCardStory2;
                bitmap4 = bitmap3;
                str = strY;
                bitmap5 = null;
                Bitmap bitmap11 = bitmap2;
                strO = fanStampCardStory.r().o();
                listQ0 = ihc1.Q0(strO, new String[]{" "}, 0, 6);
                if (listQ0.size() > 1) {
                    int size4 = listQ0.size() / 2;
                    List list4 = listQ0;
                    strO = f4i1.f(o7h.y0(o7h.d1(list4, size4), " ", (String) null, (String) null, (iu30) null, 62), "\n", o7h.y0(o7h.k0(list4, size4), " ", (String) null, (String) null, (iu30) null, 62));
                }
                String strP4 = fanStampCardStory.r().p();
                Activity activity4 = f8c1Var.a;
                zdaVarArr5[i4] = new zk10(bitmap11, bitmap4, str, bitmap5, who1.y(jon1.p(2132018010, activity4), strO, strP4), who1.y(jon1.p(2132018007, activity4), fanStampCardStory.q().o(), fanStampCardStory.q().p()), who1.y(jon1.p(2132018006, activity4), fanStampCardStory.n().o(), fanStampCardStory.n().p()), who1.y(jon1.p(2132018003, activity4), fanStampCardStory.v().o(), fanStampCardStory.v().p()), who1.y(jon1.p(2132018006, activity4), fanStampCardStory.u().o(), fanStampCardStory.u().p()), who1.y(jon1.p(2132018004, activity4), fanStampCardStory.A().o(), fanStampCardStory.A().p()), fanStampCardStory.p().o(), fanStampCardStory.p().s(), f8c1Var.i.a, !f8c1Var.e);
                sk41Var2.getClass();
                vk41VarArr5[i5] = sk41.a(zdaVarArr4);
                return p7h.M(vk41VarArr4);
            }
        }
        return d9nVar;
    }
}
