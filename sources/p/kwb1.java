package p;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.scrollsita.v1.Section;
import com.spotify.superconnect.pairingapi.SuperConnectPairingKeyStoreError;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kwb1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwb1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new kwb1((ewb1) this.b, (lwb1) obj2, lnmVar, (byte) 0);
            case 1:
                return new kwb1((rwj) this.b, (ven0) obj2, lnmVar, (byte) 1);
            case 2:
                return new kwb1((wen0) this.b, (lsc1) obj2, lnmVar, (byte) 2);
            case 3:
                return new kwb1((ru9) this.b, (c0d1) obj2, lnmVar, (byte) 3);
            case 4:
                kwb1 kwb1Var = new kwb1((k7d1) obj2, lnmVar, (byte) 4);
                kwb1Var.b = obj;
                return kwb1Var;
            case 5:
                return new kwb1((k9d1) this.b, (ven0) obj2, lnmVar, (byte) 5);
            case 6:
                return new kwb1((iad1) this.b, (iu30) obj2, lnmVar, (byte) 6);
            case 7:
                kwb1 kwb1Var2 = new kwb1((cxd1) obj2, lnmVar, (byte) 7);
                kwb1Var2.b = obj;
                return kwb1Var2;
            case 8:
                kwb1 kwb1Var3 = new kwb1((r7e1) obj2, lnmVar, (byte) 8);
                kwb1Var3.b = obj;
                return kwb1Var3;
            case 9:
                kwb1 kwb1Var4 = new kwb1((kn0) obj2, lnmVar, (byte) 9);
                kwb1Var4.b = obj;
                return kwb1Var4;
            case 10:
                return new kwb1((rk41) this.b, (tob1) obj2, lnmVar, (byte) 10);
            case 11:
                return new kwb1((gdf1) this.b, (rk41) obj2, lnmVar, (byte) 11);
            case 12:
                return new kwb1((vqf1) this.b, (xqf1) obj2, lnmVar, (byte) 12);
            case 13:
                return new kwb1((zen0) this.b, (ven0) obj2, lnmVar, (byte) 13);
            case 14:
                return new kwb1((abu0) this.b, (zau0) obj2, lnmVar, (byte) 14);
            case 15:
                return new kwb1((jwf1) this.b, (String) obj2, lnmVar, (byte) 15);
            case 16:
                return new kwb1((j7g1) this.b, obj2, lnmVar, (byte) 16);
            case 17:
                return new kwb1((fcd1) this.b, (tob1) obj2, lnmVar, (byte) 17);
            case 18:
                return new kwb1((h680) this.b, (idg1) obj2, lnmVar, (byte) 18);
            case 19:
                return new kwb1((wen0) this.b, (jm6) obj2, lnmVar, (byte) 19);
            case 20:
                return new kwb1((xq81) this.b, (jrl0) obj2, lnmVar, (byte) 20);
            case 21:
                return new kwb1((gsh1) this.b, (dlg1) obj2, lnmVar, (byte) 21);
            case 22:
                return new kwb1((gwh1) this.b, (kwh1) obj2, lnmVar, (byte) 22);
            case 23:
                return new kwb1((fyh1) this.b, (String) obj2, lnmVar, (byte) 23);
            case 24:
                return new kwb1((l9i1) this.b, (String) obj2, lnmVar, (byte) 24);
            case 25:
                return new kwb1((File) this.b, (w9i1) obj2, lnmVar, (byte) 25);
            case 26:
                return new kwb1((zci1) this.b, (DatePickerDialog) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new kwb1((String) this.b, (fni1) obj2, lnmVar, (byte) 27);
            case 28:
                return new kwb1((kzi1) this.b, (String) obj2, lnmVar, (byte) 28);
            default:
                return new kwb1((n1j1) this.b, (String) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((nwq0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((ugn) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((yqe1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        rih1 m231Var;
        Object objC;
        Bundle bundleH;
        int i;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                if (((ewb1) this.b).i && (function0 = ((lwb1) this.c).e) != null) {
                    function0.invoke();
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.c;
                if (((String) ven0Var.getValue()).length() > 0) {
                    ((kt91) ((rwj) this.b).f).k(new er91((fs91) null, (String) ven0Var.getValue(), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    ven0Var.setValue("");
                }
                return rih1.a;
            case 2:
                hm5.M(obj);
                bpb1 bpb1Var = (wen0) this.b;
                Set setSingleton = Collections.singleton(((lsc1) this.c).b);
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, setSingleton);
                return rih1.a;
            case 3:
                hm5.M(obj);
                b0d1 b0d1Var = (a0d1) ((ru9) this.b).b;
                c0d1 c0d1Var = (c0d1) this.c;
                byte[] bArr = c0d1Var.a;
                b0d1 b0d1Var2 = b0d1Var;
                if (bArr.length == 32) {
                    SharedPreferences sharedPreferences = (SharedPreferences) b0d1Var2.b.getValue();
                    if (sharedPreferences == null) {
                        objC = b0d1.d();
                    } else {
                        try {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.getClass();
                            editorEdit.putString("pending-key-v1", Base64.encodeToString(bArr, 2));
                            editorEdit.apply();
                            m231Var = rih1.a;
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        objC = b0d1.c(m231Var);
                    }
                    break;
                } else {
                    b0d1Var2.getClass();
                    objC = new m231(new SuperConnectPairingKeyStoreError.InvalidKeyLength());
                }
                if (e331.a(objC) != null) {
                    return crn0.a;
                }
                Set set = s4b1.f;
                return new ern0(uic.x(pcf.d(6, c0d1Var.b, (String) null)));
            case 4:
                nwq0 nwq0Var = (nwq0) this.b;
                hm5.M(obj);
                int i2 = nwq0Var == null ? -1 : h7d1.a[nwq0Var.ordinal()];
                idd1 idd1Var = ((k7d1) this.c).f1;
                if (i2 == 1) {
                    int i3 = k7d1.h1;
                    syd sydVar = (syd) idd1Var.getValue();
                    if (!sydVar.b && nwq0Var != sydVar.c) {
                        sydVar.c = nwq0Var;
                        sydVar.a(sydVar.a, sydVar.d, sydVar.e, 300L, 300L).start();
                    }
                } else {
                    int i4 = k7d1.h1;
                    syd sydVar2 = (syd) idd1Var.getValue();
                    nwq0Var.getClass();
                    if (!sydVar2.b && nwq0Var != sydVar2.c) {
                        sydVar2.c = nwq0Var;
                        sydVar2.a(sydVar2.a, sydVar2.e, sydVar2.d, 200L, 0L).start();
                    }
                }
                return rih1.a;
            case 5:
                hm5.M(obj);
                ((ven0) this.c).setValue((k9d1) this.b);
                return rih1.a;
            case 6:
                hm5.M(obj);
                iad1 iad1Var = (iad1) this.b;
                t24 t24Var = iad1Var.a;
                t24 t24Var2 = iad1Var.a;
                jad1 jad1Var = (jad1) t24Var.h.getValue();
                jad1 jad1Var2 = jad1.c;
                if (jad1Var != jad1Var2) {
                    iu30 iu30Var = (iu30) this.c;
                    if (t24Var2.j.s() != 0.0f && !Float.isNaN(t24Var2.j.s())) {
                        jad1Var2 = t24Var2.j.s() > 0.0f ? jad1.a : jad1.b;
                    }
                    iu30Var.invoke(jad1Var2);
                }
                return rih1.a;
            case 7:
                ugn ugnVar = (ugn) this.b;
                hm5.M(obj);
                ((jxd1) ((cxd1) this.c).a.get()).d(ugnVar);
                return rih1.a;
            case 8:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                r7e1 r7e1Var = (r7e1) this.c;
                fn31.T(c9nVar, (o8n) null, 0, new y4e1(r7e1Var, (lnm) null, (byte) 1), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new y4e1(r7e1Var, (lnm) null, (byte) 2), 3);
            case 9:
                yqe1 yqe1Var = (yqe1) this.b;
                hm5.M(obj);
                return Boolean.valueOf(!yqe1Var.c && yqe1Var.a.getNumber() >= ((kn0) this.c).getNumber());
            case 10:
                Object obj2 = ((rk41) this.b).c;
                hm5.M(obj);
                if (((Boolean) ((tob1) this.c).getValue()).booleanValue()) {
                    ((ycl1) obj2).a(igm1.a);
                    ((ycl1) obj2).a(fgm1.a);
                }
                return rih1.a;
            case 11:
                rih1 rih1Var = rih1.a;
                hm5.M(obj);
                gdf1 gdf1Var = (gdf1) this.b;
                if (gdf1Var.g()) {
                    boolean z = ((rk41) this.c).b;
                    ejj1 ejj1Var = gdf1Var.c;
                    if (z) {
                        ejj1Var.d().p(2);
                    } else {
                        ejj1Var.d().o(false);
                    }
                }
                return rih1Var;
            case 12:
                hm5.M(obj);
                ssf1 ssf1Var = ((vqf1) this.b).b;
                xqf1 xqf1Var = (xqf1) this.c;
                ssf1Var.b(new dmf1(xqf1Var.a, nik1.y4, (String) null, new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -42465, 63), (Map) null), xqf1Var.b);
                return rih1.a;
            case 13:
                hm5.M(obj);
                zen0 zen0Var = (zen0) this.b;
                Boolean bool = (Boolean) ((ven0) this.c).getValue();
                bool.booleanValue();
                zen0Var.w1(bool);
                return rih1.a;
            case 14:
                hm5.M(obj);
                ((abu0) this.b).a((zau0) this.c);
                return rih1.a;
            case 15:
                hm5.M(obj);
                ((wr00) ((jwf1) this.b).c.get()).a((String) this.c);
                return rih1.a;
            case 16:
                hm5.M(obj);
                if (!((m7g1) ((j7g1) this.b)).c) {
                    ((j7g1) this.b).e.invoke(this.c);
                }
                return rih1.a;
            case 17:
                hm5.M(obj);
                ((fcd1) this.b).a(!((Boolean) ((tob1) this.c).getValue()).booleanValue());
                return rih1.a;
            case 18:
                hm5.M(obj);
                ((obl1) ((h680) this.b).b).a(((idg1) this.c).a.c);
                return rih1.a;
            case 19:
                hm5.M(obj);
                bpb1 bpb1Var3 = (wen0) this.b;
                jm6 jm6Var = (jm6) this.c;
                bpb1 bpb1Var4 = bpb1Var3;
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, jm6Var);
                return rih1.a;
            case 20:
                hm5.M(obj);
                ((i8h1) ((xq81) this.b).b).f(((jrl0) this.c).e(), (Set) null);
                return rih1.a;
            case 21:
                hm5.M(obj);
                gsh1 gsh1Var = (gsh1) this.b;
                if (gsh1Var.equals(fsh1.a) || gsh1Var.equals(bsh1.a)) {
                    ((lzn0) ((dlg1) this.c).a).e();
                }
                return rih1.a;
            case 22:
                hm5.M(obj);
                ((gwh1) this.b).a.invoke(new bl7(((kwh1) this.c).a));
                return rih1.a;
            case 23:
                hm5.M(obj);
                awl1 awl1VarD = awl1.d(((fyh1) this.b).a);
                return upn1.t(new k65(awl1VarD.d.a, "loadStatusFuture", new qga0(new jfa((String) this.c, (byte) 13), awl1VarD.c, (byte) 16), (byte) 14)).b.get();
            case 24:
                hm5.M(obj);
                l9i1 l9i1Var = (l9i1) this.b;
                String str = (String) this.c;
                if (str != null) {
                    l9i1Var.getClass();
                    bundleH = mno1.h(new mmr0[]{new mmr0("screenshotFilePath", str)});
                } else {
                    bundleH = null;
                }
                a1r0.m(l9i1Var.b, nik1.I5.a, (tv80) null, bundleH, 8);
                return rih1.a;
            case 25:
                hm5.M(obj);
                boolean zExists = ((File) this.b).exists();
                float f = 1.0f;
                if (zExists) {
                    File file = (File) this.b;
                    if (file.exists()) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                            int i5 = options.outWidth;
                            if (i5 > 0 && (i = options.outHeight) > 0) {
                                f = i5 / i;
                            }
                        } catch (Exception e) {
                            Logger.e(e, l1d.m("Failed to decode bitmap dimensions for ", file.getAbsolutePath()), new Object[0]);
                        }
                    }
                }
                w9i1 w9i1Var = (w9i1) this.c;
                Object obj3 = w9i1Var.x1;
                File file2 = (File) this.b;
                synchronized (obj3) {
                    if (!w9i1Var.z1 && !w9i1Var.w1) {
                        bpb1 bpb1Var5 = w9i1Var.g1;
                        Float f2 = new Float(f);
                        bpb1Var5.getClass();
                        bpb1Var5.m((Object) null, f2);
                        w9i1Var.e1.l(zExists ? file2 : null);
                    }
                    break;
                }
                return rih1.a;
            case 26:
                hm5.M(obj);
                m6r m6rVar = ((zci1) this.b).b;
                Integer num = m6rVar.c;
                Integer num2 = m6rVar.e;
                Integer num3 = m6rVar.d;
                if (num != null && num3 != null && num2 != null) {
                    ((DatePickerDialog) this.c).updateDate(num.intValue(), num3.intValue(), num2.intValue());
                }
                return rih1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                hm5.M(obj);
                String str2 = (String) this.b;
                if (str2 != null) {
                    ymi1 ymi1VarC = ((fni1) this.c).c();
                    ymi1VarC.c = new brl0(str2, ymi1VarC.b, (byte) 19);
                }
                return rih1.a;
            case 28:
                hm5.M(obj);
                return Boolean.valueOf(z710.d(((kzi1) this.b).d, (String) this.c, false, 6));
            default:
                hm5.M(obj);
                return Boolean.valueOf(z710.d(((n1j1) this.b).d, (String) this.c, false, 6));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwb1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
