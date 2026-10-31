package defpackage;

import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.AudioEpisode;
import p.a8d1;
import p.c9n;
import p.d9n;
import p.dlv;
import p.eg;
import p.fe5;
import p.flv;
import p.ge7;
import p.hm5;
import p.ilv;
import p.irn1;
import p.iu30;
import p.klv;
import p.lnm;
import p.mlv;
import p.n8b1;
import p.o95;
import p.pxg1;
import p.rih1;
import p.uvg0;
import p.vu30;
import p.x3d1;
import p.yua0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ o95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o95 o95Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        o95 o95Var = this.c;
        switch (b) {
            case 0:
                return new b(o95Var, lnmVar, (byte) 0);
            case 1:
                return new b(o95Var, lnmVar, (byte) 1);
            case 2:
                return new b(o95Var, lnmVar, (byte) 2);
            case 3:
                return new b(o95Var, lnmVar, (byte) 3);
            case 4:
                return new b(o95Var, lnmVar, (byte) 4);
            case 5:
                return new b(o95Var, lnmVar, (byte) 5);
            case 6:
                return new b(o95Var, lnmVar, (byte) 6);
            case 7:
                return new b(o95Var, lnmVar, (byte) 7);
            case 8:
                return new b(o95Var, lnmVar, (byte) 8);
            case 9:
                return new b(o95Var, lnmVar, (byte) 9);
            case 10:
                return new b(o95Var, lnmVar, (byte) 10);
            case 11:
                return new b(o95Var, lnmVar, (byte) 11);
            case 12:
                return new b(o95Var, lnmVar, (byte) 12);
            case 13:
                return new b(o95Var, lnmVar, (byte) 13);
            case 14:
                return new b(o95Var, lnmVar, (byte) 14);
            case 15:
                return new b(o95Var, lnmVar, (byte) 15);
            case 16:
                return new b(o95Var, lnmVar, (byte) 16);
            case 17:
                return new b(o95Var, lnmVar, (byte) 17);
            case 18:
                return new b(o95Var, lnmVar, (byte) 18);
            case 19:
                return new b(o95Var, lnmVar, (byte) 19);
            case 20:
                return new b(o95Var, lnmVar, (byte) 20);
            case 21:
                return new b(o95Var, lnmVar, (byte) 21);
            case 22:
                return new b(o95Var, lnmVar, (byte) 22);
            case 23:
                return new b(o95Var, lnmVar, (byte) 23);
            case 24:
                return new b(o95Var, lnmVar, (byte) 24);
            case 25:
                return new b(o95Var, lnmVar, (byte) 25);
            case 26:
                return new b(o95Var, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new b(o95Var, lnmVar, (byte) 27);
            default:
                return new b(o95Var, lnmVar, (byte) 28);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f = new Float(4000.0f);
                pxg1 pxg1VarO0 = irn1.o0(4000, 0, mlv.d, 2);
                this.b = true;
                return o95.b(this.c, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f2 = new Float(0.0f);
                yua0 yua0VarE0 = irn1.e0(ge7.Y);
                this.b = true;
                return o95.b(this.c, f2, yua0VarE0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Float f3 = new Float(1.0f);
                    this.b = true;
                    return this.c.g(f3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f4 = new Float(1.0f);
                pxg1 pxg1VarO1 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f4, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f5 = new Float(1.0f);
                pxg1 pxg1VarO2 = irn1.o0(AudioEpisode.SHOW_URI_FIELD_NUMBER, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f5, pxg1VarO2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    Float f6 = new Float(0.0f);
                    this.b = true;
                    return o95.b(this.c, f6, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    Float f7 = new Float(0.0f);
                    this.b = true;
                    return o95.b(this.c, f7, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f8 = new Float(0.0f);
                pxg1 pxg1VarO3 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f8, pxg1VarO3, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f9 = new Float(0.0f);
                pxg1 pxg1VarO4 = irn1.o0(200, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f9, pxg1VarO4, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f10 = new Float(0.0f);
                pxg1 pxg1VarO5 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f10, pxg1VarO5, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f11 = new Float(1.0f);
                pxg1 pxg1VarO6 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f11, pxg1VarO6, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 11:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f12 = new Float(1.0f);
                pxg1 pxg1VarO7 = irn1.o0(500, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f12, pxg1VarO7, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f13 = new Float(1.0f);
                pxg1 pxg1VarO8 = irn1.o0(500, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f13, pxg1VarO8, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f14 = new Float(1.0f);
                pxg1 pxg1VarO9 = irn1.o0(350, 0, uvg0.a, 2);
                this.b = true;
                return o95.b(this.c, f14, pxg1VarO9, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f15 = new Float(0.0f);
                pxg1 pxg1VarO10 = irn1.o0(300, 0, uvg0.b, 2);
                this.b = true;
                return o95.b(this.c, f15, pxg1VarO10, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 15:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f16 = new Float(0.0f);
                pxg1 pxg1VarO11 = irn1.o0(300, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f16, pxg1VarO11, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 16:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f17 = new Float(0.0f);
                pxg1 pxg1VarO12 = irn1.o0(200, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f17, pxg1VarO12, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 17:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    Float f18 = new Float(0.0f);
                    this.b = true;
                    return o95.b(this.c, f18, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z18) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    Float f19 = new Float(1.0f);
                    this.b = true;
                    return o95.b(this.c, f19, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z19) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f20 = new Float(1.0f);
                pxg1 pxg1VarO13 = irn1.o0(1200, 0, klv.a, 2);
                this.b = true;
                return o95.b(this.c, f20, pxg1VarO13, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 20:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f21 = new Float(1.0f);
                pxg1 pxg1VarO14 = irn1.o0(1200, 0, klv.a, 2);
                this.b = true;
                return o95.b(this.c, f21, pxg1VarO14, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f22 = new Float(1.0f);
                pxg1 pxg1VarO15 = irn1.o0(500, 0, (dlv) null, 6);
                this.b = true;
                return o95.b(this.c, f22, pxg1VarO15, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f23 = new Float(1.0f);
                n8b1 n8b1Var = x3d1.a;
                this.b = true;
                return o95.b(this.c, f23, n8b1Var, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 23:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f24 = new Float(0.0f);
                n8b1 n8b1Var2 = x3d1.b;
                this.b = true;
                return o95.b(this.c, f24, n8b1Var2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f25 = new Float(0.0f);
                ilv.a.getClass();
                pxg1 pxg1VarO16 = irn1.o0(1200, 0, flv.j, 2);
                this.b = true;
                return o95.b(this.c, f25, pxg1VarO16, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f26 = new Float(0.0f);
                n8b1 n8b1VarL0 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
                this.b = true;
                return o95.b(this.c, f26, n8b1VarL0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Float f27 = new Float(0.0f);
                n8b1 n8b1VarL1 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
                this.b = true;
                return o95.b(this.c, f27, n8b1VarL1, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    Float f28 = new Float(0.0f);
                    this.b = true;
                    return o95.b(this.c, f28, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z28) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    Float f29 = new Float(0.0f);
                    this.b = true;
                    return o95.b(this.c, f29, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z29) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
