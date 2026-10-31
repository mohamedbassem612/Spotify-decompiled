package p;

import android.content.Context;
import com.spotify.messages.DjInteractivityConnectionAttempt;
import com.spotify.share.shareables.impl.ShareablesBitmapParseException;
import io.reactivex.rxjava3.functions.Function;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t8r0 implements Function, pt71, nyc, fsc1, s5n1 {
    public Object a;
    public Object b;

    public t8r0(i8h1 i8h1Var, byte b) {
        switch (b) {
            case 19:
                this.a = i8h1Var;
                this.b = new LinkedHashSet();
                break;
            default:
                this.a = i8h1Var;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.b = lap1.n(yon1.X2().c);
                break;
        }
    }

    public ut71 a() {
        return (fma1) this.a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        return new g500(0, (String) this.a, ((vfw) this.b).b(), (Throwable) obj);
    }

    public /* bridge */ /* synthetic */ Object b() {
        l5n1 l5n1Var = (l5n1) this.b;
        return new n5n1((y5n1) ((l5n1) this.a).b(), (d6n1) l5n1Var.b());
    }

    public File d() {
        File file;
        File file2 = (File) this.a;
        if (file2 != null) {
            return file2;
        }
        synchronized (this) {
            try {
                file = (File) this.a;
                if (file == null) {
                    wi20 wi20Var = (wi20) this.b;
                    wi20Var.a();
                    file = new File(wi20Var.a.getFilesDir(), "PersistedInstallation." + ((wi20) this.b).d() + ".json");
                    this.a = file;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public hfp1 e(Object obj) {
        n5n1 n5n1Var = (n5n1) this.a;
        return o0c.z(new c6n1(n5n1Var.b, ((h7n1) this.b).a, ((Long) obj).longValue()));
    }

    public Object f(Object obj, mma0 mma0Var) {
        Object obj2;
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference != null && (obj2 = weakReference.get()) != null) {
            return obj2;
        }
        Object objInvoke = ((Function0) this.a).invoke();
        this.b = new WeakReference(objInvoke);
        return objInvoke;
    }

    public void g(s19 s19Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", s19Var.a);
            jSONObject.put("Status", l1d.C(s19Var.b));
            jSONObject.put("AuthToken", s19Var.c);
            jSONObject.put("RefreshToken", s19Var.d);
            jSONObject.put("TokenCreationEpochInSecs", s19Var.f);
            jSONObject.put("ExpiresInSecs", s19Var.e);
            jSONObject.put("FisError", s19Var.g);
            wi20 wi20Var = (wi20) this.b;
            wi20Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", wi20Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(d())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public Context getContext() {
        return (Context) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Throwable th, String str, String str2, onm onmVar) {
        lq71 lq71Var;
        String str3;
        String str4;
        w771 w771Var;
        if (onmVar instanceof lq71) {
            lq71Var = (lq71) onmVar;
            int i = lq71Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lq71Var.f = i - Integer.MIN_VALUE;
            } else {
                lq71Var = new lq71(this, onmVar);
            }
        } else {
            lq71Var = new lq71(this, onmVar);
        }
        Object objI = lq71Var.d;
        int i2 = lq71Var.f;
        if (i2 == 0) {
            hm5.M(objI);
            if (th instanceof ShareablesBitmapParseException) {
                w771Var = new w771(lf51.b(2), str2, str, "Bitmap returned from shareables failed to be parsed", e9p1.p(th));
            } else {
                str3 = str;
                str4 = str2;
                zwz0 zwz0Var = (zwz0) this.a;
                lq71Var.a = th;
                lq71Var.b = str3;
                lq71Var.c = str4;
                lq71Var.f = 1;
                objI = b5p1.i(zwz0Var.b(), lq71Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            ((g871) this.b).b(w771Var);
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str5 = lq71Var.c;
        String str6 = lq71Var.b;
        th = lq71Var.a;
        hm5.M(objI);
        str3 = str6;
        str4 = str5;
        w771Var = ((Boolean) objI).booleanValue() ? new w771(lf51.b(3), str4, str3, "Device offline", e9p1.p(th)) : new w771(lf51.b(1), str4, str3, "Failure loading an image from shareables", e9p1.p(th));
        ((g871) this.b).b(w771Var);
        return rih1.a;
    }

    public void i(okl1 okl1Var, int i, int i2, String str) {
        anu anuVarN = DjInteractivityConnectionAttempt.n();
        anuVarN.n(okl1Var.a());
        anuVarN.t(okl1Var.b());
        anuVarN.u(((yqg) this.b).b());
        anuVarN.q(xvj1.w(i));
        anuVarN.s(i2);
        if (str != null) {
            anuVarN.r(str);
        }
        DjInteractivityConnectionAttempt djInteractivityConnectionAttemptBuild = anuVarN.build();
        t2j0 t2j0Var = (t2j0) this.a;
        djInteractivityConnectionAttemptBuild.getClass();
        t2j0Var.a(djInteractivityConnectionAttemptBuild);
    }

    public tv80 j(z47 z47Var) {
        ksk0 ksk0Var = (ksk0) this.b;
        kly0 kly0Var = (kly0) this.a;
        if (z47Var.equals(tu80.g)) {
            return ((i8h1) kly0Var.get()).m(ksk0Var.j().e().h(), null);
        }
        if (z47Var instanceof kv80) {
            kv80 kv80Var = (kv80) z47Var;
            return ((i8h1) kly0Var.get()).m(ksk0Var.j().l(kv80Var.x()).e(kv80Var.x()), null);
        }
        if (z47Var instanceof qu80) {
            return ((i8h1) kly0Var.get()).m(ksk0Var.e().j(((qu80) z47Var).x()), null);
        }
        if (z47Var instanceof ev80) {
            ev80 ev80Var = (ev80) z47Var;
            return ((i8h1) kly0Var.get()).m(ksk0Var.i(ev80Var.x()).a(ev80Var.x()), null);
        }
        if (z47Var instanceof mv80) {
            mv80 mv80Var = (mv80) z47Var;
            return ((i8h1) kly0Var.get()).m(ksk0Var.k().m(mv80Var.x()).a(mv80Var.y()), null);
        }
        if (z47Var instanceof bv80) {
            bv80 bv80Var = (bv80) z47Var;
            return ((i8h1) kly0Var.get()).m(ksk0Var.j().i(Integer.valueOf(bv80Var.z()), bv80Var.y()).a(bv80Var.x()), null);
        }
        if (z47Var instanceof wu80) {
            return ((i8h1) kly0Var.get()).m(ksk0Var.j().h(((wu80) z47Var).x()).i(), null);
        }
        if (z47Var instanceof vu80) {
            vu80 vu80Var = (vu80) z47Var;
            return ((i8h1) kly0Var.get()).m(ksk0Var.h(vu80Var.x()).k().e(vu80Var.y()), null);
        }
        eg.o();
        return null;
    }

    @Override // p.nyc
    public void k(jf01 jf01Var, IOException iOException) {
        ig01.c((ig01) this.a, iOException, null, 6);
    }

    public void l(boolean z) {
        ((i8h1) ((ynb0) this.a).get()).m(((tdl0) this.b).r(z ? ywx0.a(1) : ywx0.a(2)).h().q(), null);
    }

    public void m(int i, String str) {
        ((i8h1) ((ynb0) this.a).get()).m(((tdl0) this.b).r(ywx0.a(1)).w().o(Integer.valueOf(i), str), null);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0093 -> B:16:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.nyc
    public void n(p.jf01 r18, p.ry21 r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t8r0.n(p.jf01, p.ry21):void");
    }

    public s19 o() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(d());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = s19.h;
        at7 at7Var = new at7();
        at7Var.k(0L);
        at7Var.j(1);
        at7Var.f(0L);
        at7Var.g(strOptString);
        at7Var.j(k4s0._values()[iOptInt]);
        at7Var.e(strOptString2);
        at7Var.i(strOptString3);
        at7Var.k(jOptLong);
        at7Var.f(jOptLong2);
        at7Var.h(strOptString4);
        return at7Var.b();
    }

    public void p(mkb1 mkb1Var, int i) {
        ((dwl1) this.b).a(new qvb((lsw0) this.a, mkb1Var, false, i));
    }

    public /* synthetic */ t8r0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public t8r0(Function0 function0) {
        this.a = function0;
    }
}
