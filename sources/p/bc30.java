package p;

import android.net.http.X509TrustManagerExtensions;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bc30 extends hab0 implements Function0 {
    public static final bc30 N0;
    public static final bc30 O0;
    public static final bc30 P0;
    public static final bc30 Q0;
    public static final bc30 R0;
    public static final bc30 S0;
    public static final bc30 T0;
    public static final bc30 U0;
    public static final bc30 V0;
    public static final bc30 W0;
    public static final bc30 X;
    public static final bc30 X0;
    public static final bc30 Y;
    public static final bc30 Y0;
    public static final bc30 Z;
    public static final bc30 Z0;
    public static final bc30 a1;
    public static final bc30 b;
    public static final bc30 b1;
    public static final bc30 c;
    public static final bc30 c1;
    public static final bc30 d;
    public static final bc30 d1;
    public static final bc30 e;
    public static final bc30 e1;
    public static final bc30 f;
    public static final bc30 g;
    public static final bc30 h;
    public static final bc30 i;
    public static final bc30 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new bc30(i2, (byte) 0);
        c = new bc30(i2, (byte) 1);
        d = new bc30(i2, (byte) 2);
        e = new bc30(i2, (byte) 3);
        f = new bc30(i2, (byte) 4);
        g = new bc30(i2, (byte) 5);
        h = new bc30(i2, (byte) 6);
        i = new bc30(i2, (byte) 7);
        t = new bc30(i2, (byte) 8);
        X = new bc30(i2, (byte) 9);
        Y = new bc30(i2, (byte) 10);
        Z = new bc30(i2, (byte) 11);
        N0 = new bc30(i2, (byte) 12);
        O0 = new bc30(i2, (byte) 13);
        P0 = new bc30(i2, (byte) 14);
        Q0 = new bc30(i2, (byte) 15);
        R0 = new bc30(i2, (byte) 16);
        S0 = new bc30(i2, (byte) 17);
        T0 = new bc30(i2, (byte) 18);
        U0 = new bc30(i2, (byte) 19);
        V0 = new bc30(i2, (byte) 20);
        W0 = new bc30(i2, (byte) 21);
        X0 = new bc30(i2, (byte) 22);
        Y0 = new bc30(i2, (byte) 23);
        Z0 = new bc30(i2, (byte) 24);
        a1 = new bc30(i2, (byte) 25);
        b1 = new bc30(i2, (byte) 26);
        c1 = new bc30(i2, (byte) 27);
        d1 = new bc30(i2, (byte) 28);
        e1 = new bc30(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc30(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() throws NoSuchAlgorithmException, KeyStoreException {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                ArrayList arrayList = new ArrayList();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                return new X509TrustManagerExtensions((X509TrustManager) o7h.V0(arrayList));
            case 1:
                return gl30.Companion.serializer();
            case 2:
                return fc11.v("com.spotify.payment.commercesafetyimpl.endpoint.FraudDataCollectionEndpoint.EventType", gl30.values(), new String[]{"PAGE_VIEW"}, new Annotation[][]{null});
            case 3:
                return b7x.a;
            case 4:
                return Float.valueOf(0.0f);
            case 5:
                return rih1Var;
            case 6:
                return v8r.q(Boolean.FALSE);
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 8:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 9:
                return new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
            case 10:
                return new SimpleDateFormat("dd MMM", Locale.getDefault());
            case 11:
                return rih1Var;
            case 12:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 13:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 14:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : n440.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 15:
                return new r36(z920.a, (byte) 0);
            case 16:
                return new r36(w411.a, (byte) 0);
            case 17:
                return new r36(ni40.a, (byte) 0);
            case 18:
                return new r36(vk0.a, (byte) 0);
            case 19:
                return new r36(xvt.a, (byte) 0);
            case 20:
                return new r36(aji0.a, (byte) 0);
            case 21:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.blend.members.api.GetInvitationResponse", jd11Var.b(zn40.class), new tka0[]{jd11Var.b(xn40.class)}, new nma0[]{vn40.a}, new Annotation[0]);
            case 22:
                return new r36(nlz0.a, (byte) 0);
            case 23:
                return new r36(nlz0.a, (byte) 0);
            case 24:
                return new r36(s1d1.a, (byte) 0);
            case 25:
                return new r36(xlh1.a, (byte) 0);
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return rih1Var;
            default:
                return Boolean.TRUE;
        }
    }
}
