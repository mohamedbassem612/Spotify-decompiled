package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class wfa0 implements nma0 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public wfa0(tka0 tka0Var) {
        this.b = tka0Var;
        this.c = omo1.l("JsonContentPolymorphicSerializer<" + tka0Var.r() + '>', rcv0.h, new h661[0]);
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public nma0 c(ega0 ega0Var) {
        Set setKeySet = fga0.l(ega0Var).a.keySet();
        if (setKeySet.contains("sendMessage")) {
            return dse.Companion.serializer();
        }
        if (setKeySet.contains("deleteMessage")) {
            return ase.Companion.serializer();
        }
        if (setKeySet.contains("unpinMessage")) {
            return gse.Companion.serializer();
        }
        uh61.j("Unknown ChatChannelEvent: none of sendMessage, deleteMessage, unpinMessage found");
        return null;
    }

    public abstract Object d(Object obj, Object obj2);

    public final Object deserialize(dar darVar) {
        switch (this.a) {
            case 0:
                bga0 bga0VarT = dem1.t(darVar);
                ega0 ega0VarM = bga0VarT.m();
                nma0 nma0VarC = c(ega0VarM);
                nfa0 nfa0VarD = bga0VarT.d();
                nfa0VarD.getClass();
                return hon1.z(nfa0VarD, ega0VarM, nma0VarC);
            default:
                h661 descriptor = getDescriptor();
                x1k x1kVarB = darVar.b(descriptor);
                x1kVarB.getClass();
                Object obj = hno1.a;
                Object objA = obj;
                Object objA2 = objA;
                while (true) {
                    int iP = x1kVarB.p(getDescriptor());
                    if (iP == -1) {
                        if (objA == obj) {
                            uh61.j("Element 'key' is missing");
                            return null;
                        }
                        if (objA2 == obj) {
                            uh61.j("Element 'value' is missing");
                            return null;
                        }
                        Object objD = d(objA, objA2);
                        x1kVarB.a(descriptor);
                        return objD;
                    }
                    if (iP == 0) {
                        objA = x1kVarB.A(getDescriptor(), 0, (nma0) this.b, (Object) null);
                    } else {
                        if (iP != 1) {
                            uh61.j(f4i1.c(iP, "Invalid index: "));
                            return null;
                        }
                        objA2 = x1kVarB.A(getDescriptor(), 1, (nma0) this.c, (Object) null);
                    }
                }
                break;
        }
    }

    public h661 getDescriptor() {
        return (j661) this.c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                tka0 tka0Var = (tka0) obj2;
                nma0 nma0VarS = uaxVar.c().s(tka0Var, obj);
                if (nma0VarS == null) {
                    Class<?> cls = obj.getClass();
                    jd11 jd11Var = rc11.a;
                    nma0 nma0VarV = wmo1.v(jd11Var.b(cls));
                    if (nma0VarV == null) {
                        tka0 tka0VarB = jd11Var.b(obj.getClass());
                        String strR = tka0VarB.r();
                        if (strR == null) {
                            strR = String.valueOf(tka0VarB);
                        }
                        uh61.j(cy30.p("Class '", strR, "' is not registered for polymorphic serialization ", "in the scope of '" + tka0Var.r() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    } else {
                        nma0VarS = nma0VarV;
                    }
                }
                nma0VarS.serialize(uaxVar, obj);
                break;
            default:
                z1k z1kVarB = uaxVar.b(getDescriptor());
                z1kVarB.k(getDescriptor(), 0, (nma0) obj2, a(obj));
                z1kVarB.k(getDescriptor(), 1, (nma0) this.c, b(obj));
                z1kVarB.a(getDescriptor());
                break;
        }
    }

    public wfa0(nma0 nma0Var, nma0 nma0Var2) {
        this.b = nma0Var;
        this.c = nma0Var2;
    }
}
