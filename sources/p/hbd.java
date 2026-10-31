package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hbd implements xpw {
    public final lzn0 a;
    public final vb2 b;
    public final iu30 c;
    public final ljm0 d = h7w.B(new qka(1, this, hbd.class, "stateFromProps", "stateFromProps(Lcom/spotify/campfire/elements/dialogs/errordialog/api/CampfireErrorDialogElement$Props;)Lcom/spotify/campfire/elements/dialogs/errordialog/api/CampfireErrorDialogElement$State;", 0, (byte) 15), (o8n) null, (iu30) null, new hp9(this, (byte) 21), 6);
    public final ia00 e = n3o1.q(this).a(s1b.V0, s1b.W0);
    public final psw f;

    public hbd(lzn0 lzn0Var, vb2 vb2Var, iu30 iu30Var) {
        this.a = lzn0Var;
        this.b = vb2Var;
        this.c = iu30Var;
        j2i j2iVar = oai.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public static gbd e(fbd fbdVar) {
        ebd bbdVar;
        liz lizVar = fbdVar.a;
        boolean z = fbdVar.b;
        Intent intent = fbdVar.c;
        if (u890.j(lizVar, jiz.a)) {
            bbdVar = abd.a;
        } else if (u890.j(lizVar, miz.a)) {
            bbdVar = cbd.a;
        } else if (u890.j(lizVar, giz.a)) {
            bbdVar = z ? xad.a : zad.a;
        } else if (u890.j(lizVar, niz.a)) {
            bbdVar = z ? yad.a : dbd.a;
        } else if (u890.j(lizVar, hiz.a)) {
            bbdVar = vad.a;
        } else if (lizVar instanceof liz) {
            bbdVar = new bbd(intent, lizVar.a);
        } else {
            if (!u890.j(lizVar, kiz.a) && !u890.j(lizVar, iiz.a) && lizVar != null) {
                eg.o();
                return null;
            }
            bbdVar = z ? wad.a : uad.a;
        }
        return new gbd(bbdVar);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
