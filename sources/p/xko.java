package p;

import com.spotify.listplatform.contextmenu.ItemUnavailableException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class xko {
    public static final o3r a = w3p1.o(new l4r(hvm.b, 1, kfo.Z0, new j4r(kfo.X0), kfo.a1), kfo.Y0);

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(d0r d0rVar, String str, onm onmVar) throws ItemUnavailableException {
        uko ukoVar;
        if (onmVar instanceof uko) {
            ukoVar = (uko) onmVar;
            int i = ukoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukoVar.b = i - Integer.MIN_VALUE;
            } else {
                ukoVar = new uko(onmVar);
            }
        } else {
            ukoVar = new uko(onmVar);
        }
        Object objB = ukoVar.a;
        int i2 = ukoVar.b;
        if (i2 == 0) {
            hm5.M(objB);
            ukoVar.b = 1;
            objB = b(d3p1.F(d0rVar, a, str), ukoVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return Boolean.valueOf(((vnb1) objB).a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(ay8 ay8Var, onm onmVar) throws ItemUnavailableException {
        vko vkoVar;
        if (onmVar instanceof vko) {
            vkoVar = (vko) onmVar;
            int i = vkoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vkoVar.b = i - Integer.MIN_VALUE;
            } else {
                vkoVar = new vko(onmVar);
            }
        } else {
            vkoVar = new vko(onmVar);
        }
        Object objJ = vkoVar.a;
        int i2 = vkoVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objJ);
            jte jteVar = new jte(2, lnmVar, (byte) 11);
            vkoVar.b = 1;
            objJ = b5p1.j(ay8Var, jteVar, vkoVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }
}
