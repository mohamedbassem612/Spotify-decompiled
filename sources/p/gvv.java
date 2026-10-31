package p;

import android.icu.text.BreakIterator;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class gvv implements Update {
    public final Next a(Object obj, Object obj2) {
        kvv kvvVar = (kvv) obj;
        evv evvVar = (evv) obj2;
        Map map = kvvVar.T0;
        boolean z = kvvVar.X0;
        if (evvVar instanceof quv) {
            return Next.j();
        }
        boolean z2 = evvVar instanceof luv;
        ztv ztvVar = ztv.a;
        if (z2) {
            return (kvvVar.O0 || !z) ? Next.a(Collections.singleton(ztvVar)) : Next.h(kvv.a(kvvVar, false, true, false, false, (Map) null, (w10) null, (gne) null, 8355839));
        }
        if (evvVar instanceof xuv) {
            String str = ((xuv) evvVar).a;
            return (str.length() <= 0 || str.equals(kvvVar.b)) ? Next.h(kvv.a(kvvVar, false, false, false, false, sqg0.K(h4w.class, map), (w10) null, (gne) null, 7864319)) : Next.h(kvv.a(kvvVar, false, false, false, false, sqg0.P(map, new mmr0(h4w.class, new h4w(str))), (w10) null, (gne) null, 7864319));
        }
        if (evvVar instanceof puv) {
            return Next.h(kvv.a(kvvVar, false, false, true, false, (Map) null, (w10) null, (gne) null, 8323071));
        }
        if (evvVar instanceof bvv) {
            w10 w10Var = kvvVar.U0;
            kvv kvvVarA = kvv.a(kvvVar, false, false, false, false, b7x.a, (w10) null, (gne) null, 6815743);
            if (w10Var instanceof u10) {
                return ((u10) w10Var).a ? Next.i(kvvVarA, Collections.singleton(new xtv(true))) : Next.h(kvv.a(kvvVarA, false, false, false, true, (Map) null, (w10) null, (gne) null, 8257535));
            }
            if (w10Var instanceof v10) {
                return Next.i(kvvVarA, Collections.singleton(new auv(((v10) w10Var).a)));
            }
            if (w10Var == null) {
                return Next.i(kvv.a(kvvVarA, false, false, false, false, (Map) null, (w10) null, (gne) null, 8126463), Collections.singleton(ztvVar));
            }
            eg.o();
            return null;
        }
        if (evvVar instanceof muv) {
            return Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 8323071));
        }
        if (evvVar instanceof zuv) {
            return Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 7340031));
        }
        if (evvVar instanceof avv) {
            return Next.a(Collections.singleton(new buv(o7h.l1(map.values()))));
        }
        if (evvVar instanceof ouv) {
            return Next.i(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 8306687), Collections.singleton(ztvVar));
        }
        if (evvVar instanceof uuv) {
            return z ? Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, new u10(true), (gne) null, 7340031)) : Next.a(Collections.singleton(new xtv(true)));
        }
        if (evvVar instanceof nuv) {
            return Next.a(Collections.singleton(ytv.a));
        }
        if (evvVar instanceof tuv) {
            return z ? Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, new u10(false), (gne) null, 7340031)) : Next.h(kvv.a(kvvVar, false, false, false, true, (Map) null, (w10) null, (gne) null, 8257535));
        }
        if (evvVar instanceof yuv) {
            return ((yuv) evvVar).a ? Next.a(Collections.singleton(ztvVar)) : Next.j();
        }
        if (evvVar instanceof wuv) {
            String str2 = ((wuv) evvVar).a;
            Map mapP = !str2.equals(kvvVar.Y) ? sqg0.P(map, new mmr0(g4w.class, new g4w(str2))) : sqg0.K(g4w.class, map);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str2);
            int i = 0;
            while (characterInstance.next() != -1) {
                i++;
            }
            return Next.h(kvv.a(kvvVar, false, false, false, false, mapP, (w10) null, new gne(kvvVar.W0.a, i, i >= 250), 3670015));
        }
        if (evvVar instanceof dvv) {
            int iC = l1d.C(((dvv) evvVar).a);
            if (iC == 0) {
                return Next.i(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 8355839), Collections.singleton(ztvVar));
            }
            if (iC == 1) {
                return Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 8355839));
            }
            eg.o();
            return null;
        }
        if (evvVar instanceof ruv) {
            return Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 8257535));
        }
        if (evvVar instanceof suv) {
            return Next.i(kvv.a(kvvVar, false, false, false, false, (Map) null, (w10) null, (gne) null, 8257535), Collections.singleton(new xtv(false)));
        }
        if (evvVar instanceof vuv) {
            tv80 tv80Var = ((vuv) evvVar).a;
            return z ? Next.h(kvv.a(kvvVar, false, false, false, false, (Map) null, new v10(tv80Var), (gne) null, 7340031)) : Next.a(Collections.singleton(new auv(tv80Var)));
        }
        if (!(evvVar instanceof cvv)) {
            eg.o();
            return null;
        }
        cvv cvvVar = (cvv) evvVar;
        if (kvvVar.f) {
            boolean z3 = kvvVar.g;
            boolean z4 = cvvVar.a;
            if (z3 != z4) {
                return Next.h(kvv.a(kvvVar, z4, false, false, false, sqg0.P(map, new mmr0(i4w.class, new i4w(z4))), (w10) null, (gne) null, 7864255));
            }
        }
        return Next.j();
    }
}
