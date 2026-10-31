package p;

import android.net.Uri;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.VideoConfiguration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ddf1 {
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object a(SceneTemplate.TopSongJourneyContent.SongEntry songEntry, int i, String str, bju bjuVar, gw70 gw70Var, woa woaVar, v290 v290Var, tjz tjzVar, tob1 tob1Var, boolean z, x0e1 x0e1Var, onm onmVar) {
        adf1 adf1Var;
        tjz tjzVar2;
        tob1 tob1Var2;
        x0e1 x0e1Var2;
        boolean z2;
        String str2;
        woa woaVar2;
        v290 v290Var2;
        boolean z3;
        f311 ucf1Var;
        if (onmVar instanceof adf1) {
            adf1Var = (adf1) onmVar;
            int i2 = adf1Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adf1Var.t = i2 - Integer.MIN_VALUE;
            } else {
                adf1Var = new adf1(onmVar);
            }
        } else {
            adf1Var = new adf1(onmVar);
        }
        adf1 adf1Var2 = adf1Var;
        Object obj = adf1Var2.i;
        int i3 = adf1Var2.t;
        if (i3 == 0) {
            hm5.M(obj);
            adf1Var2.a = songEntry;
            adf1Var2.b = str;
            adf1Var2.c = woaVar;
            adf1Var2.d = v290Var;
            tjzVar2 = tjzVar;
            adf1Var2.e = tjzVar2;
            tob1Var2 = tob1Var;
            adf1Var2.f = tob1Var2;
            x0e1Var2 = x0e1Var;
            adf1Var2.g = x0e1Var2;
            z2 = z;
            adf1Var2.h = z2;
            adf1Var2.t = 1;
            Object objD = d(songEntry, bjuVar, gw70Var, v290Var, "contender_" + i, adf1Var2);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            str2 = str;
            woaVar2 = woaVar;
            obj = objD;
            v290Var2 = v290Var;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = adf1Var2.h;
            x0e1 x0e1Var3 = adf1Var2.g;
            tob1 tob1Var3 = adf1Var2.f;
            tjz tjzVar3 = adf1Var2.e;
            v290Var2 = adf1Var2.d;
            woaVar2 = adf1Var2.c;
            str2 = adf1Var2.b;
            SceneTemplate.TopSongJourneyContent.SongEntry songEntry2 = adf1Var2.a;
            hm5.M(obj);
            z2 = z4;
            x0e1Var2 = x0e1Var3;
            tob1Var2 = tob1Var3;
            tjzVar2 = tjzVar3;
            songEntry = songEntry2;
        }
        ofa1 ofa1Var = (ofa1) obj;
        lfa1 lfa1VarQ = vby0.q(songEntry, ofa1Var);
        if (ofa1Var instanceof nfa1) {
            boolean z5 = z2;
            ucf1Var = new gdf1(lfa1VarQ, str2, c(songEntry.t(), woaVar2, v290Var2, !z2), tjzVar2, tob1Var2, z5, null, 384);
            z3 = z5;
        } else {
            z3 = z2;
            if (!(ofa1Var instanceof mfa1)) {
                eg.o();
                return null;
            }
            ucf1Var = new ucf1(lfa1VarQ, tob1Var2, z3, null, 240);
        }
        gdf1 gdf1Var = ucf1Var instanceof gdf1 ? (gdf1) ucf1Var : null;
        return new ce6(ucf1Var, tob1Var2, gdf1Var != null ? gdf1Var.k : v8r.q(Boolean.FALSE), z3, (Function0) x0e1Var2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object b(SceneTemplate.TopSongJourneyContent.SongEntry songEntry, String str, bju bjuVar, gw70 gw70Var, woa woaVar, v290 v290Var, tjz tjzVar, wcf1 wcf1Var, hrr0 hrr0Var, boolean z, j4f1 j4f1Var, boolean z2, onm onmVar) {
        bdf1 bdf1Var;
        woa woaVar2;
        boolean z3;
        boolean z4;
        SceneTemplate.TopSongJourneyContent.SongEntry songEntry2;
        tjz tjzVar2;
        wcf1 wcf1Var2;
        hrr0 hrr0Var2;
        j4f1 j4f1Var2;
        String str2;
        Object obj;
        v290 v290Var2;
        if (onmVar instanceof bdf1) {
            bdf1Var = (bdf1) onmVar;
            int i = bdf1Var.Y;
            if ((i & Integer.MIN_VALUE) != 0) {
                bdf1Var.Y = i - Integer.MIN_VALUE;
            } else {
                bdf1Var = new bdf1(onmVar);
            }
        } else {
            bdf1Var = new bdf1(onmVar);
        }
        bdf1 bdf1Var2 = bdf1Var;
        Object obj2 = bdf1Var2.X;
        int i2 = bdf1Var2.Y;
        if (i2 == 0) {
            hm5.M(obj2);
            bdf1Var2.a = songEntry;
            bdf1Var2.b = str;
            woaVar2 = woaVar;
            bdf1Var2.c = woaVar2;
            bdf1Var2.d = v290Var;
            bdf1Var2.e = tjzVar;
            bdf1Var2.f = wcf1Var;
            bdf1Var2.g = hrr0Var;
            bdf1Var2.h = j4f1Var;
            z3 = z;
            bdf1Var2.i = z3;
            z4 = z2;
            bdf1Var2.t = z4;
            bdf1Var2.Y = 1;
            Object objD = d(songEntry, bjuVar, gw70Var, v290Var, "reveal", bdf1Var2);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            songEntry2 = songEntry;
            tjzVar2 = tjzVar;
            wcf1Var2 = wcf1Var;
            hrr0Var2 = hrr0Var;
            j4f1Var2 = j4f1Var;
            str2 = str;
            obj = objD;
            v290Var2 = v290Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = bdf1Var2.t;
            boolean z6 = bdf1Var2.i;
            j4f1Var2 = bdf1Var2.h;
            hrr0Var2 = bdf1Var2.g;
            wcf1Var2 = bdf1Var2.f;
            tjzVar2 = bdf1Var2.e;
            v290 v290Var3 = bdf1Var2.d;
            woa woaVar3 = bdf1Var2.c;
            str2 = bdf1Var2.b;
            songEntry2 = bdf1Var2.a;
            hm5.M(obj2);
            z4 = z5;
            z3 = z6;
            obj = obj2;
            v290Var2 = v290Var3;
            woaVar2 = woaVar3;
        }
        ofa1 ofa1Var = (ofa1) obj;
        lfa1 lfa1VarQ = vby0.q(songEntry2, ofa1Var);
        if (wcf1Var2 != null) {
            lfa1VarQ = new lfa1(wcf1Var2, lfa1VarQ.b, lfa1VarQ.c, lfa1VarQ.d, lfa1VarQ.e, lfa1VarQ.f);
        }
        if (ofa1Var instanceof nfa1) {
            return new gdf1(lfa1VarQ, str2, c(songEntry2.t(), woaVar2, v290Var2, z4), tjzVar2, hrr0Var2, z3, j4f1Var2, 64);
        }
        if (!(ofa1Var instanceof mfa1)) {
            eg.o();
            return 0;
        }
        return new ucf1(lfa1VarQ, hrr0Var2, z3, j4f1Var2, 8);
    }

    public static final ejj1 c(VideoConfiguration videoConfiguration, woa woaVar, v290 v290Var, boolean z) {
        String url;
        VideoConfiguration.Source sourceS = videoConfiguration.s();
        int iO = sourceS.o();
        int i = iO == 0 ? -1 : zcf1.a[l1d.C(iO)];
        if (i != -1) {
            if (i == 1) {
                url = sourceS.getUrl();
            } else if (i == 2) {
                url = sourceS.getManifestId();
            } else if (i != 3) {
                eg.o();
                return null;
            }
            return new ejj1(woaVar, url, e(videoConfiguration.s(), v290Var), videoConfiguration.q(), z);
        }
        hhg1.o(sourceS, "Unrecognized source ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(SceneTemplate.TopSongJourneyContent.SongEntry songEntry, bju bjuVar, gw70 gw70Var, v290 v290Var, String str, onm onmVar) {
        cdf1 cdf1Var;
        if (onmVar instanceof cdf1) {
            cdf1Var = (cdf1) onmVar;
            int i = cdf1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdf1Var.b = i - Integer.MIN_VALUE;
            } else {
                cdf1Var = new cdf1(onmVar);
            }
        } else {
            cdf1Var = new cdf1(onmVar);
        }
        Object objE = cdf1Var.a;
        int i2 = cdf1Var.b;
        if (i2 == 0) {
            hm5.M(objE);
            if (!songEntry.u()) {
                if (songEntry.v()) {
                    return new nfa1(e(songEntry.t().s(), v290Var));
                }
                hhg1.n("SongEntry must have either cover_image or video");
                return null;
            }
            String strE = f4i1.e(str, "_cover");
            ob01 ob01Var = new ob01(songEntry, gw70Var, (lnm) null, (byte) 21);
            cdf1Var.b = 1;
            objE = bjuVar.e(strE, ob01Var, cdf1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return new mfa1((yj41) objE);
    }

    public static final Uri e(VideoConfiguration.Source source, v290 v290Var) {
        int iO = source.o();
        int i = iO == 0 ? -1 : zcf1.a[l1d.C(iO)];
        if (i != -1) {
            if (i == 1) {
                String url = source.getUrl();
                try {
                    Uri uri = Uri.parse(url);
                    uri.getClass();
                    return uri;
                } catch (Exception unused) {
                    k220.f("Error parsing uri: ".concat(url));
                    return null;
                }
            }
            if (i == 2) {
                String manifestId = source.getManifestId();
                v290Var.getClass();
                String strN = wqn1.n(manifestId);
                try {
                    Uri uri2 = Uri.parse(strN);
                    uri2.getClass();
                    return uri2;
                } catch (Exception unused2) {
                    k220.f("Error parsing uri: ".concat(strN));
                    return null;
                }
            }
            if (i != 3) {
                eg.o();
                return null;
            }
        }
        hhg1.o(source, "Unrecognized source ");
        return null;
    }
}
