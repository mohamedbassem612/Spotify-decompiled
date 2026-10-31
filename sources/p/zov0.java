package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.connectivity.auth.esperanto.proto.EsSession;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zov0 implements Function, BiFunction, Predicate, ap40, s2i1, xu91, is31, e4o1, a6g1, dl4, c290, s5n1, wto1 {
    public final /* synthetic */ byte a;
    public static final zov0 b = new zov0((byte) 0);
    public static final zov0 c = new zov0((byte) 1);
    public static final zov0 d = new zov0((byte) 2);
    public static final zov0 e = new zov0((byte) 4);
    public static final zov0 f = new zov0((byte) 5);
    public static final zov0 g = new zov0((byte) 6);
    public static final zov0 h = new zov0((byte) 7);
    public static final zov0 i = new zov0((byte) 8);
    public static final zov0 t = new zov0((byte) 9);
    public static final zov0 X = new zov0((byte) 10);

    public zov0(rbx0 rbx0Var) {
        this.a = (byte) 18;
    }

    public static sn21 c(String str, r8i0 r8i0Var) {
        mmr0 mmr0VarU = jch0.u(r8i0Var);
        Charset charset = (Charset) mmr0VarU.a;
        r8i0 r8i0Var2 = (r8i0) mmr0VarU.b;
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        w4n1.a(bytes.length, 0L, length);
        return new sn21(length, r8i0Var2, bytes);
    }

    public static sn21 d(int i2, r8i0 r8i0Var, byte[] bArr) {
        if ((i2 & 1) != 0) {
            r8i0Var = null;
        }
        int length = bArr.length;
        w4n1.a(bArr.length, 0L, length);
        return new sn21(length, r8i0Var, bArr);
    }

    public int a(int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                vov0 vov0Var = (vov0) obj;
                if (vov0Var.equals(tov0.a)) {
                    return "";
                }
                if (vov0Var instanceof uov0) {
                    return ((uov0) vov0Var).a;
                }
                eg.o();
                return null;
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsSession.APPermanentErrorResult.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.auth.esperanto.proto.EsSession.APPermanentErrorResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
        }
    }

    public /* synthetic */ Object b() {
        return new u7n1("StandardIntegrity");
    }

    public Object convert(int i2) {
        hm8 hm8VarA = hm8.a(i2);
        return hm8VarA == null ? hm8.h : hm8VarA;
    }

    public String e(String str) {
        try {
            InputStream inputStreamD = a0b.d(str);
            if (inputStreamD != null) {
                return new BufferedReader(new InputStreamReader(inputStreamD)).readLine();
            }
            return null;
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    @Override // p.is31
    public Intent f(Intent intent) {
        String dataString = intent.getDataString();
        dataString.getClass();
        String strW = nhc1.W(nhc1.W(dataString, "https://www.spotify.com/", "https://open.spotify.com/"), "https://spotify.com/", "https://open.spotify.com/");
        Intent intent2 = new Intent(intent);
        intent2.setData(Uri.parse(strW));
        return intent2;
    }

    @Override // p.s2i1
    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get("show_id");
        if (str3 != null && gho1.n(str3)) {
            return new ua81(str3, str2, str, xkg0Var);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((PlayerState) obj).track().c();
            default:
                return ((j8x0) obj).b() == 3;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "Start";
            default:
                return super.toString();
        }
    }

    @Override // p.dl4
    public void w(Object obj) {
    }

    public boolean zzb(Class cls) {
        return vyn1.class.isAssignableFrom(cls);
    }

    public g6o1 zzc(Class cls) {
        if (!vyn1.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (g6o1) vyn1.i(cls.asSubclass(vyn1.class)).b(3, (vyn1) null);
        } catch (Exception e2) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    public /* synthetic */ zov0(byte b2) {
        this.a = b2;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new mmr0(((mmr0) obj).b, (String) obj2);
    }
}
