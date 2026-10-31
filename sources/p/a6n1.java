package p;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Window;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.model.RavelinJSONError;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a6n1 implements s5n1, myc, vy11, g1p1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public a6n1(nbo1 nbo1Var) {
        this.a = (byte) 6;
        this.c = new Handler(Looper.getMainLooper());
        this.b = nbo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, lnm lnmVar) {
        uzo1 uzo1Var;
        vgn0 vgn0Var;
        if (lnmVar instanceof uzo1) {
            uzo1Var = (uzo1) lnmVar;
            int i = uzo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzo1Var.d = i - Integer.MIN_VALUE;
            } else {
                uzo1Var = new uzo1(this, (onm) lnmVar);
            }
        } else {
            uzo1Var = new uzo1(this, (onm) lnmVar);
        }
        Object obj = uzo1Var.b;
        int i2 = uzo1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            vgn0Var = (xgn0) this.c;
            uzo1Var.e = str;
            uzo1Var.a = vgn0Var;
            uzo1Var.d = 1;
            Object objA = vgn0Var.a(uzo1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vgn0 vgn0Var2 = uzo1Var.a;
            String str2 = uzo1Var.e;
            hm5.M(obj);
            vgn0Var = vgn0Var2;
            str = str2;
        }
        try {
            File cacheDir = ((Application) this.b).getCacheDir();
            StringBuilder sb = new StringBuilder(4 + String.valueOf(str).length());
            sb.append("rce_");
            sb.append(str);
            File file = new File(cacheDir, sb.toString());
            return file.exists() ? new String(ilo1.F(file), StandardCharsets.UTF_8) : null;
        } finally {
            vgn0Var.c((Object) null);
        }
    }

    @Override // p.vy11
    public /* synthetic */ void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 3:
                ((cfn1) obj).n().g1(new sjn1((non1) obj4, (bsd1) obj2, (byte) 1), (cjn1) obj3);
                break;
            default:
                ((arn1) obj4).y((String) obj3, (vhp1) obj, (bsd1) obj2);
                break;
        }
    }

    @Override // p.s5n1
    public Object b() {
        return new y5n1((Context) ((jc10) this.b).a, (u7n1) ((l5n1) this.c).b(), new rtw0((byte) 22));
    }

    public hfp1 c(Activity activity, r8o r8oVar) {
        if (r8oVar.b()) {
            return o0c.z((Object) null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", r8oVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        bsd1 bsd1Var = new bsd1();
        intent.putExtra("result_receiver", (Parcelable) new vtc1(this, (Handler) this.c, bsd1Var));
        activity.startActivity(intent);
        return bsd1Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        tzo1 tzo1Var;
        vgn0 vgn0Var;
        boolean z;
        if (onmVar instanceof tzo1) {
            tzo1Var = (tzo1) onmVar;
            int i = tzo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzo1Var.d = i - Integer.MIN_VALUE;
            } else {
                tzo1Var = new tzo1(this, onmVar);
            }
        } else {
            tzo1Var = new tzo1(this, onmVar);
        }
        Object obj = tzo1Var.b;
        int i2 = tzo1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            vgn0Var = (xgn0) this.c;
            tzo1Var.e = str;
            tzo1Var.a = vgn0Var;
            tzo1Var.d = 1;
            Object objA = vgn0Var.a(tzo1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vgn0 vgn0Var2 = tzo1Var.a;
            String str2 = tzo1Var.e;
            hm5.M(obj);
            vgn0Var = vgn0Var2;
            str = str2;
        }
        try {
            try {
                File cacheDir = ((Application) this.b).getCacheDir();
                StringBuilder sb = new StringBuilder(4 + String.valueOf(str).length());
                sb.append("rce_");
                sb.append(str);
                File file = new File(cacheDir, sb.toString());
                z = file.exists() && file.delete();
            } catch (Exception unused) {
            }
            return yah0.m(z);
        } finally {
            vgn0Var.c((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, String str2, lnm lnmVar) {
        wzo1 wzo1Var;
        vgn0 vgn0Var;
        if (lnmVar instanceof wzo1) {
            wzo1Var = (wzo1) lnmVar;
            int i = wzo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wzo1Var.d = i - Integer.MIN_VALUE;
            } else {
                wzo1Var = new wzo1(this, (onm) lnmVar);
            }
        } else {
            wzo1Var = new wzo1(this, (onm) lnmVar);
        }
        Object obj = wzo1Var.b;
        int i2 = wzo1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            vgn0Var = (xgn0) this.c;
            wzo1Var.e = str;
            wzo1Var.f = str2;
            wzo1Var.a = vgn0Var;
            wzo1Var.d = 1;
            Object objA = vgn0Var.a(wzo1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vgn0 vgn0Var2 = wzo1Var.a;
            str2 = wzo1Var.f;
            String str3 = wzo1Var.e;
            hm5.M(obj);
            vgn0Var = vgn0Var2;
            str = str3;
        }
        try {
            zme zmeVar = new zme('A', 'z');
            ArrayList arrayList = new ArrayList(q7h.U(zmeVar, 10));
            yme it = zmeVar.iterator();
            while (it.hasNext()) {
                arrayList.add(yah0.n(it.a()));
            }
            String strY0 = o7h.y0(((ArrayList) k4p1.C(arrayList)).subList(0, 8), "", (String) null, (String) null, (iu30) null, 62);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + strY0.length());
            sb.append(str);
            sb.append(strY0);
            String string = sb.toString();
            Application application = (Application) this.b;
            File cacheDir = application.getCacheDir();
            StringBuilder sb2 = new StringBuilder(string.length() + 4);
            sb2.append("rce_");
            sb2.append(string);
            File file = new File(cacheDir, sb2.toString());
            ilo1.G(file, str2.getBytes(StandardCharsets.UTF_8));
            File cacheDir2 = application.getCacheDir();
            StringBuilder sb3 = new StringBuilder(4 + String.valueOf(str).length());
            sb3.append("rce_");
            sb3.append(str);
            file.renameTo(new File(cacheDir2, sb3.toString()));
            return rih1.a;
        } finally {
            vgn0Var.c((Object) null);
        }
    }

    public String f() {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) this.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                hhg1.n("Invalid application ID: ".concat(str));
                return null;
            }
            sb.append("/");
            sb.append(upperCase);
        }
        Collection<String> collection = (Collection) this.c;
        boolean z = false;
        if (collection != null) {
            if (collection.isEmpty()) {
                hhg1.n("Must specify at least one namespace");
                return null;
            }
            boolean z2 = str != null;
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String string : collection) {
                o4e.b(string);
                if (!z3) {
                    sb.append(",");
                }
                if (!o4e.a.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i = 0; i < string.length(); i++) {
                        char cCharAt = string.charAt(i);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                z3 = false;
            }
            z = z2;
        } else if (str != null) {
            z = true;
        }
        if (true != z && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    public void u(dxc dxcVar, Throwable th) {
        boolean z = th instanceof IOException;
        i6n1 i6n1Var = (i6n1) this.b;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        i6n1Var.h(new RavelinJSONError(0, message, (String) null, System.currentTimeMillis(), 4, (DefaultConstructorMarker) null), z);
        evz0 evz0Var = (evz0) this.c;
        if (evz0Var != null) {
            evz0Var.a(new RavelinError(th.getMessage(), null, 2, null));
        }
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
        i6n1 i6n1Var = (i6n1) this.b;
        evz0 evz0Var = (evz0) this.c;
        if (sy21Var.a.Q0) {
            if (evz0Var != null) {
                Events eventsI = i6n1Var.i();
                if (eventsI != null) {
                    eventsI.Com8();
                }
                evz0Var.b();
                return;
            }
            return;
        }
        try {
            uz21 uz21Var = sy21Var.c;
            String strF = uz21Var != null ? uz21Var.f() : null;
            RavelinJSONError ravelinJSONError = (RavelinJSONError) (strF != null ? (Parcelable) ozn1.p().a(strF, m5n1.z(RavelinJSONError.Companion.serializer())) : null);
            if (ravelinJSONError != null) {
                int iLpt5 = ravelinJSONError.Lpt5();
                if (evz0Var != null) {
                    evz0Var.a(new RavelinError(ravelinJSONError.lpt2(), null, 2, null));
                }
                if (1 <= iLpt5 && iLpt5 < 200) {
                    j2p1.v(i6n1.g, "Invalid status code status: " + ravelinJSONError.Lpt5());
                    return;
                }
                if (200 <= iLpt5 && iLpt5 < 400) {
                    j2p1.v(i6n1.g, "A successful call status: " + ravelinJSONError.Lpt5());
                    return;
                }
                if (400 <= iLpt5 && iLpt5 < 429) {
                    j2p1.v(i6n1.g, "Invalid request status: " + ravelinJSONError.Lpt5());
                    return;
                }
                if (iLpt5 == 429) {
                    j7n1.a(i6n1Var, ravelinJSONError);
                    return;
                }
                if (450 <= iLpt5 && iLpt5 < 500) {
                    j2p1.v(i6n1.g, "Custom error-Client error, status: " + ravelinJSONError.Lpt5());
                    return;
                }
                if (500 <= iLpt5 && iLpt5 < 506) {
                    j7n1.a(i6n1Var, ravelinJSONError);
                    return;
                }
                j2p1.v(i6n1.g, "We couldn't capture status code: " + iLpt5);
            }
        } catch (Exception e) {
            j2p1.v(i6n1.g, "An unexpected object came from an answer. Couldn't parse. " + e.getMessage());
        }
    }

    public /* synthetic */ a6n1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public a6n1(ni niVar, AlertDialog alertDialog) {
        this.a = (byte) 2;
        this.b = alertDialog;
        this.c = niVar;
    }

    public a6n1(jc10 jc10Var, l5n1 l5n1Var, avw0 avw0Var) {
        this.a = (byte) 0;
        this.b = jc10Var;
        this.c = l5n1Var;
    }

    public a6n1(Application application) {
        this.a = (byte) 7;
        this.b = application;
        this.c = ygn0.a();
    }

    public a6n1(Window window, String str, utw0 utw0Var) {
        this.a = (byte) 5;
        this.b = str;
        this.c = utw0Var;
    }
}
