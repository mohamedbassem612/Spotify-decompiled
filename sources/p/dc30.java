package p;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dc30 implements HostnameVerifier {
    public static final cc30 f = new cc30();
    public static final Set g = f46.S0(new rhc[]{u890.v("43bffa19d6ef651451f6841e019931e96f6f2eaeff28ab4b6f1ce4576de2717b"), u890.v("49dd353dc2b919a3770645117d0e60c16115e7d1bc259eefe734b00ea434fe5f"), u890.v("5c0660a2b164910d8ff589c18e14552e9e0ec237dcefe2cb736d41a4811f81a0"), u890.v("63ecefee431d49523bc1136c4e72d0206a477086caf606cd5cf025686c109cf8"), u890.v("92c063d67e8f14db71d288e11266ffdaf69cbf115f7bab14f3bc2f68d25e0e30"), u890.v("e0254c7fcdc265e2f0f8a428dabb75ab4ae039b4872d62f5ee57f0877d5a8a41"), u890.v("ebed6475c2c2d80fcb199f3fe8dd6e6b3ce60b77eb15d4e42c3dec0c6f5b5105"), u890.v("ec4ffa1ad0ac88081314b7aaffef6a91f97cd57291bb5ba686c5415f5eb4f6b6")});
    public static final idd1 h = new idd1(ny00.e1);
    public static final idd1 i = new idd1(bc30.b);
    public static final ConcurrentHashMap.KeySetView j = ConcurrentHashMap.newKeySet();
    public static final idd1 k = new idd1(ny00.d1);
    public final Set a;
    public final HostnameVerifier b;
    public final Function0 c;
    public final vu30 d;
    public final vu30 e;

    public dc30(ac30 ac30Var, int i2) {
        HostnameVerifier hostnameVerifier = (HostnameVerifier) h.getValue();
        ac30 ac30Var2 = (i2 & 4) != 0 ? ny00.c1 : ac30Var;
        cc30 cc30Var = f;
        c4z c4zVar = new c4z(2, cc30Var, cc30.class, "platformValidatedChain", "platformValidatedChain(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, (byte) 7);
        c4z c4zVar2 = new c4z(2, cc30Var, cc30.class, "noteOnce", "noteOnce(Ljava/lang/String;Lokio/ByteString;)V", 0, (byte) 8);
        this.a = g;
        this.b = hostnameVerifier;
        this.c = ac30Var2;
        this.d = c4zVar;
        this.e = c4zVar2;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws NoSuchAlgorithmException {
        List list;
        rhc rhcVar;
        if (!this.b.verify(str, sSLSession)) {
            return false;
        }
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            return true;
        }
        List listQ0 = f46.Q0(sSLSession.getPeerCertificates());
        List list2 = listQ0;
        try {
            list = (List) this.d.invoke(str, listQ0);
        } catch (Exception | LinkageError unused) {
            list = z6x.a;
        }
        ArrayList arrayListN0 = o7h.N0(list, list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            if (obj instanceof X509Certificate) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            rhcVar = null;
            if (!it.hasNext()) {
                break;
            }
            byte[] encoded = ((X509Certificate) it.next()).getPublicKey().getEncoded();
            int length = encoded.length;
            zod.u(encoded.length, 0L, length);
            byte[] bArrZ = f46.Z(0, encoded, length);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrZ, 0, bArrZ.length);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            rhc rhcVar2 = new rhc(bArrDigest);
            if (this.a.contains(rhcVar2)) {
                rhcVar = rhcVar2;
            }
        } while (rhcVar == null);
        if (rhcVar == null) {
            return true;
        }
        this.e.invoke(str, rhcVar);
        return false;
    }
}
