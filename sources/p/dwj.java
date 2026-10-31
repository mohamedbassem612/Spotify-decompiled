package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dwj extends z031 implements vu30 {
    public int b;
    public int c;
    public int d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ewj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwj(ewj ewjVar, lnm lnmVar) {
        super(2, lnmVar);
        this.g = ewjVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        dwj dwjVar = new dwj(this.g, lnmVar);
        dwjVar.f = obj;
        return dwjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        r561 r561Var;
        int i;
        int i2;
        int i3;
        String strI;
        int i4;
        int i5;
        String str;
        ewj ewjVar = this.g;
        wdn0 wdn0Var = ewjVar.a;
        edn0 edn0Var = ewjVar.c;
        boolean z = this.e;
        if (!z) {
            hm5.M(obj);
            r561Var = (r561) this.f;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.d;
            i2 = this.c;
            i3 = this.b;
            r561Var = (r561) this.f;
            hm5.M(obj);
        }
        if (i3 >= Math.min(ewjVar.d + 10, edn0Var.b)) {
            return rih1.a;
        }
        int i6 = i3 + 1;
        int iC = edn0Var.c(i3);
        switch (iC) {
            case 0:
                strI = "up";
                break;
            case 1:
                String strG = gvg.g(wdn0Var.g(i2), "down ");
                i2++;
                strI = strG;
                break;
            case 2:
                strI = cy30.i(edn0Var.c(i6), "remove ", edn0Var.c(i3 + 2), " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = edn0Var.c(i6);
                int iC3 = edn0Var.c(i3 + 2);
                int iC4 = edn0Var.c(i3 + 3);
                StringBuilder sbQ = cy30.q(iC2, iC3, "move ", " ", " ");
                sbQ.append(iC4);
                strI = sbQ.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strI = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = edn0Var.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + wdn0Var.g(i2);
                int i7 = i4;
                strI = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = edn0Var.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + wdn0Var.g(i2);
                int i8 = i4;
                strI = str;
                i6 = i8;
                i2 = i5;
                break;
            case 7:
                Object objG = wdn0Var.g(i2);
                w0h1.o(2, objG);
                i2 += 2;
                strI = "apply " + ((vu30) objG);
                break;
            case 8:
                strI = gvg.g(ewjVar.b.g(i), "reuse ");
                i++;
                break;
            case 9:
                strI = "recompose pending";
                break;
            default:
                strI = f4i1.c(iC, "unknown op: ");
                break;
        }
        this.f = r561Var;
        this.b = i6;
        this.c = i2;
        this.d = i;
        this.e = true;
        r561Var.b(i3 + ": " + strI, this);
        return d9n.a;
    }
}
