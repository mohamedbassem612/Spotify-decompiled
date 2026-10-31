package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class lo70 {
    public static final ppa0 a;
    public static final ppa0 b;
    public static final ppa0 c;

    static {
        jd11 jd11Var = rc11.a;
        a = new ppa0(Collections.singletonList(new opa0("kodiakParentIdentityUri", new wlu(jd11Var.b(jo70.class)), new z5z(1, (byte) 20))));
        b = new ppa0(Collections.singletonList(new opa0("kodiakExtendedMetadataParentIdentityUri", new xv00(jd11Var.b(jo70.class)), new z5z(1, (byte) 21))));
        Collections.singletonList(new opa0("kodiakParentOrContributorUri", new xv00(jd11Var.b(jo70.class)), new z5z(1, (byte) 22))).hashCode();
        c = new ppa0(Collections.singletonList(new opa0("kodiakPrimaryArtistUri", new xv00(jd11Var.b(jo70.class)), new z5z(1, (byte) 23))));
    }
}
