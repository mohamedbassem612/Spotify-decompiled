package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ds61 implements Update {
    public static final ds61 a = new ds61();

    public final Next a(Object obj, Object obj2) {
        mr61 mr61Var = (mr61) obj;
        bq61 bq61Var = (bq61) obj2;
        if (bq61Var.equals(zp61.a)) {
            return Next.a(Effects.a(new uo61[]{uo61.a}));
        }
        boolean z = false;
        if (bq61Var instanceof op61) {
            return Next.a(Effects.a(new to61[]{new to61(((op61) bq61Var).a, false)}));
        }
        if (bq61Var instanceof pp61) {
            pp61 pp61Var = (pp61) bq61Var;
            String str = pp61Var.a;
            boolean z2 = pp61Var.b;
            mr61 mr61VarN = wro1.N(mr61Var, str);
            if (mr61VarN.equals(mr61Var)) {
                return Next.j();
            }
            if (mr61Var.c.c && z2) {
                z = true;
            }
            return Next.i(mr61VarN, Effects.a(new to61[]{new to61(str, z)}));
        }
        if (bq61Var instanceof qp61) {
            mr61 mr61VarN2 = wro1.N(mr61Var, ((qp61) bq61Var).a);
            return mr61VarN2.equals(mr61Var) ? Next.j() : Next.h(mr61VarN2);
        }
        if (bq61Var instanceof rp61) {
            return Next.a(Effects.a(new qo61[]{qo61.a}));
        }
        if (bq61Var instanceof up61) {
            return Next.a(Effects.a(new po61[]{new po61(((up61) bq61Var).a)}));
        }
        if (bq61Var instanceof vp61) {
            vp61 vp61Var = (vp61) bq61Var;
            return Next.a(Effects.a(new ro61[]{new ro61(vp61Var.a, vp61Var.b)}));
        }
        if (bq61Var instanceof wp61) {
            return Next.a(Effects.a(new vo61[]{new vo61(((wp61) bq61Var).a)}));
        }
        if (bq61Var instanceof aq61) {
            return Next.a(Effects.a(new so61[]{new so61(((aq61) bq61Var).a)}));
        }
        if (bq61Var instanceof sp61) {
            mr61 mr61VarA = mr61.a(mr61Var, null, ((sp61) bq61Var).a > 0, null, null, 13);
            return mr61VarA.equals(mr61Var) ? Next.j() : Next.h(mr61VarA);
        }
        if (bq61Var instanceof tp61) {
            mr61 mr61VarA2 = mr61.a(mr61Var, null, false, null, ((tp61) bq61Var).a, 7);
            return mr61VarA2.equals(mr61Var) ? Next.j() : Next.h(mr61VarA2);
        }
        if (bq61Var instanceof xp61) {
            mr61 mr61VarA3 = mr61.a(mr61Var, null, false, ((xp61) bq61Var).a, null, 11);
            return mr61VarA3.equals(mr61Var) ? Next.j() : Next.h(mr61VarA3);
        }
        if (bq61Var instanceof yp61) {
            mr61 mr61VarA4 = mr61.a(mr61Var, ((yp61) bq61Var).a, false, null, null, 14);
            return mr61VarA4.equals(mr61Var) ? Next.j() : Next.h(mr61VarA4);
        }
        eg.o();
        return null;
    }
}
