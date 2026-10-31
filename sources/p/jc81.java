package p;

import com.spotify.browsita.v2.resolved.showcase.CompanionMusicVideo;
import com.spotify.browsita.v2.resolved.showcase.CreativeAdMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jc81 implements s7c, tzg, sfu, niv0 {
    public final String a;
    public final String b;
    public final kc81 c;

    public jc81(String str, String str2, kc81 kc81Var) {
        this.a = str;
        this.b = str2;
        this.c = kc81Var;
    }

    @Override // p.tzg
    public final Set a() {
        CompanionMusicVideo companionMusicVideoN;
        String strN;
        xj61 xj61Var = new xj61();
        kc81 kc81Var = this.c;
        xj61Var.add(kc81Var.a);
        CreativeAdMetadata creativeAdMetadata = kc81Var.d;
        if (creativeAdMetadata != null) {
            if (!creativeAdMetadata.q()) {
                creativeAdMetadata = null;
            }
            if (creativeAdMetadata != null && (companionMusicVideoN = creativeAdMetadata.n()) != null && (strN = companionMusicVideoN.n()) != null) {
                String str = strN.length() > 0 ? strN : null;
                if (str != null) {
                    xj61Var.add(str);
                }
            }
        }
        return cwl1.j(xj61Var);
    }

    @Override // p.niv0
    public final Set b() {
        String str = this.c.a;
        if (!bbp1.k(str)) {
            str = null;
        }
        return str != null ? Collections.singleton(str) : w7x.a;
    }

    @Override // p.sfu
    public final String c() {
        return this.c.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    @Override // p.s7c
    public final List d(int i, int i2) {
        String str;
        CompanionMusicVideo companionMusicVideoN;
        String strN;
        k3h1 k3h1Var = new k3h1(i);
        kc81 kc81Var = this.c;
        sd81 sd81Var = kc81Var.c;
        String str2 = sd81Var.a;
        String str3 = sd81Var.b;
        CreativeAdMetadata creativeAdMetadata = kc81Var.d;
        ud81 ud81Var = new ud81(creativeAdMetadata != null ? jhc1.I(creativeAdMetadata.p()) : 2, str2, str3);
        String str4 = kc81Var.a;
        n1x n1xVarV = fho1.v(kc81Var.b);
        int I = creativeAdMetadata != null ? jhc1.I(creativeAdMetadata.p()) : 2;
        if (creativeAdMetadata == null) {
            str = null;
        } else {
            if (!creativeAdMetadata.q()) {
                creativeAdMetadata = null;
            }
            if (creativeAdMetadata == null || (companionMusicVideoN = creativeAdMetadata.n()) == null || (strN = companionMusicVideoN.n()) == null || strN.length() <= 0) {
                str = null;
            } else {
                str = strN;
            }
        }
        String str5 = this.a;
        return Collections.singletonList(new ic81(str5, k3h1Var, new id81(ud81Var, str5, this.b, str4, n1xVarV, (mxh) null, 2, I, str)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc81)) {
            return false;
        }
        jc81 jc81Var = (jc81) obj;
        return this.a.equals(jc81Var.a) && this.b.equals(jc81Var.b) && this.c.equals(jc81Var.c);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
