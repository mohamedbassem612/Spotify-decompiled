package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class acg {
    public static final gtv0 b = new gtv0((byte) 12);
    public static final zbg c = new zbg(0);
    public static final LinkedHashMap d = new LinkedHashMap();
    public static final acg e;
    public static final acg f;
    public static final acg g;
    public static final acg h;
    public static final acg i;
    public static final acg j;
    public static final acg k;
    public static final acg l;
    public static final acg m;
    public static final acg n;
    public static final acg o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final acg f5p;
    public static final acg q;
    public static final acg r;
    public static final acg s;
    public static final acg t;
    public final String a;

    static {
        gtv0.j("SSL_RSA_WITH_NULL_MD5");
        gtv0.j("SSL_RSA_WITH_NULL_SHA");
        gtv0.j("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        gtv0.j("SSL_RSA_WITH_RC4_128_MD5");
        gtv0.j("SSL_RSA_WITH_RC4_128_SHA");
        gtv0.j("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        gtv0.j("SSL_RSA_WITH_DES_CBC_SHA");
        e = gtv0.j("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        gtv0.j("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        gtv0.j("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        gtv0.j("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        gtv0.j("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        gtv0.j("SSL_DH_anon_WITH_RC4_128_MD5");
        gtv0.j("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        gtv0.j("SSL_DH_anon_WITH_DES_CBC_SHA");
        gtv0.j("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_KRB5_WITH_DES_CBC_SHA");
        gtv0.j("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_KRB5_WITH_RC4_128_SHA");
        gtv0.j("TLS_KRB5_WITH_DES_CBC_MD5");
        gtv0.j("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        gtv0.j("TLS_KRB5_WITH_RC4_128_MD5");
        gtv0.j("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        gtv0.j("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        gtv0.j("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        gtv0.j("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = gtv0.j("TLS_RSA_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = gtv0.j("TLS_RSA_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_RSA_WITH_NULL_SHA256");
        gtv0.j("TLS_RSA_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_RSA_WITH_AES_256_CBC_SHA256");
        gtv0.j("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        gtv0.j("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        gtv0.j("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        gtv0.j("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        gtv0.j("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        gtv0.j("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        gtv0.j("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        gtv0.j("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        gtv0.j("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        gtv0.j("TLS_PSK_WITH_RC4_128_SHA");
        gtv0.j("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_PSK_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_PSK_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_RSA_WITH_SEED_CBC_SHA");
        h = gtv0.j("TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = gtv0.j("TLS_RSA_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        gtv0.j("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        gtv0.j("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        gtv0.j("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        gtv0.j("TLS_FALLBACK_SCSV");
        gtv0.j("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        gtv0.j("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        gtv0.j("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_ECDH_RSA_WITH_NULL_SHA");
        gtv0.j("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        gtv0.j("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_ECDHE_RSA_WITH_NULL_SHA");
        gtv0.j("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        gtv0.j("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = gtv0.j("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = gtv0.j("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_ECDH_anon_WITH_NULL_SHA");
        gtv0.j("TLS_ECDH_anon_WITH_RC4_128_SHA");
        gtv0.j("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        gtv0.j("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        gtv0.j("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        gtv0.j("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        gtv0.j("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        gtv0.j("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = gtv0.j("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = gtv0.j("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        gtv0.j("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = gtv0.j("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        o = gtv0.j("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        gtv0.j("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        gtv0.j("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        gtv0.j("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f5p = gtv0.j("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = gtv0.j("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        gtv0.j("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        gtv0.j("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = gtv0.j("TLS_AES_128_GCM_SHA256");
        s = gtv0.j("TLS_AES_256_GCM_SHA384");
        t = gtv0.j("TLS_CHACHA20_POLY1305_SHA256");
        gtv0.j("TLS_AES_128_CCM_SHA256");
        gtv0.j("TLS_AES_128_CCM_8_SHA256");
    }

    public acg(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
