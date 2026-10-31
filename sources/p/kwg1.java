package p;

import com.spotify.campfire.trustedcircles.impl.proto.TrustedUser;
import com.spotify.campfire.trustedcircles.impl.proto.TrustedUsersResponse;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kwg1 {
    public final iwg1 a;
    public final cex0 b;
    public final Observable c;

    public kwg1(iwg1 iwg1Var, cex0 cex0Var, Observable observable) {
        this.a = iwg1Var;
        this.b = cex0Var;
        this.c = observable;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:2: B:26:0x0096->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:49:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Serializable a(int i, onm onmVar) {
        lnm<? super TrustedUsersResponse> jwg1Var;
        int i2;
        Object objL;
        byte b;
        byte b2;
        h290 h290VarN;
        ArrayList arrayList;
        Iterator it;
        Object objA;
        h290<TrustedUser> h290Var;
        Map map;
        ArrayList arrayList2;
        w4i1 w4i1Var;
        lo30 lo30Var;
        String username;
        ArrayList arrayList3;
        int iOrdinal;
        int i3;
        lwg1 lwg1Var;
        if (onmVar instanceof jwg1) {
            jwg1Var = (jwg1) onmVar;
            int i4 = jwg1Var.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jwg1Var.e = i4 - Integer.MIN_VALUE;
            } else {
                jwg1Var = new jwg1(this, onmVar);
            }
        } else {
            jwg1Var = new jwg1(this, onmVar);
        }
        Object obj = jwg1Var.c;
        int i5 = jwg1Var.e;
        d9n d9nVar = d9n.a;
        if (i5 == 0) {
            hm5.M(obj);
            i2 = i;
            jwg1Var.a = i2 == true ? (byte) 1 : (byte) 0;
            jwg1Var.e = 1;
            objL = fc11.l(this.c, 1, (Object) null, jwg1Var);
            if (objL != d9nVar) {
            }
            b = i2;
            return d9nVar;
        }
        if (i5 == 1) {
            byte b3 = jwg1Var.a;
            hm5.M(obj);
            objL = obj;
            b = b3;
        } else {
            if (i5 == 2) {
                byte b4 = jwg1Var.a;
                hm5.M(obj);
                b2 = b4;
                h290VarN = ((TrustedUsersResponse) obj).n();
                h290VarN.getClass();
                arrayList = new ArrayList(q7h.U(h290VarN, 10));
                it = h290VarN.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TrustedUser) it.next()).getUsername());
                }
                jwg1Var.b = h290VarN;
                jwg1Var.a = b2;
                jwg1Var.e = 3;
                objA = this.b.a(arrayList, jwg1Var);
                if (objA != d9nVar) {
                    obj = objA;
                    h290Var = h290VarN;
                }
                b = i2;
                return d9nVar;
            }
            if (i5 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h290Var = jwg1Var.b;
            hm5.M(obj);
        }
        map = (Map) obj;
        h290Var.getClass();
        arrayList2 = new ArrayList();
        for (TrustedUser trustedUser : h290Var) {
            w4i1Var = (w4i1) map.get(trustedUser.getUsername());
            if (w4i1Var != null) {
                String username2 = trustedUser.getUsername();
                username = w4i1Var.b;
                if (username.length() == 0) {
                    username = trustedUser.getUsername();
                }
                String str = username;
                String str2 = w4i1Var.c;
                List listO = trustedUser.o();
                arrayList3 = new ArrayList(q7h.U(listO, 10));
                for (qg01 qg01Var : (AbstractList) listO) {
                    qg01Var.getClass();
                    switch (qg01Var.ordinal()) {
                        case 0:
                        case 9:
                            lwg1Var = lwg1.a;
                            break;
                        case 1:
                            lwg1Var = lwg1.b;
                            break;
                        case 2:
                            lwg1Var = lwg1.c;
                            break;
                        case 3:
                            lwg1Var = lwg1.d;
                            break;
                        case 4:
                            lwg1Var = lwg1.e;
                            break;
                        case 5:
                            lwg1Var = lwg1.f;
                            break;
                        case 6:
                            lwg1Var = lwg1.g;
                            break;
                        case 7:
                            lwg1Var = lwg1.h;
                            break;
                        case 8:
                            lwg1Var = lwg1.i;
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    arrayList3.add(lwg1Var);
                }
                iOrdinal = trustedUser.n().ordinal();
                if (iOrdinal != 0 || iOrdinal == 1) {
                    i3 = 1;
                } else if (iOrdinal == 2) {
                    i3 = 2;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                lo30Var = new lo30(i3, username2, str, str2, arrayList3);
            } else {
                lo30Var = null;
            }
            if (lo30Var != null) {
                arrayList2.add(lo30Var);
            }
        }
        return arrayList2;
        b = i2;
        List<String> listM = p7h.M(new String[]{"MODIFIER_INVITE_SUGGESTIONS", "MODIFIER_FILTER_HIDDEN_FROM_SUGGESTIONS_USERS"});
        jwg1Var.a = b;
        jwg1Var.e = 2;
        Object objA2 = this.a.a((String) objL, b, listM, jwg1Var);
        if (objA2 != d9nVar) {
            b2 = b;
            obj = objA2;
            h290VarN = ((TrustedUsersResponse) obj).n();
            h290VarN.getClass();
            arrayList = new ArrayList(q7h.U(h290VarN, 10));
            it = h290VarN.iterator();
            while (it.hasNext()) {
                arrayList.add(((TrustedUser) it.next()).getUsername());
            }
            jwg1Var.b = h290VarN;
            jwg1Var.a = b2;
            jwg1Var.e = 3;
            objA = this.b.a(arrayList, jwg1Var);
            if (objA != d9nVar) {
                obj = objA;
                h290Var = h290VarN;
                map = (Map) obj;
                h290Var.getClass();
                arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                    w4i1Var = (w4i1) map.get(trustedUser.getUsername());
                    if (w4i1Var != null) {
                        String username3 = trustedUser.getUsername();
                        username = w4i1Var.b;
                        if (username.length() == 0) {
                            username = trustedUser.getUsername();
                        }
                        String str3 = username;
                        String str4 = w4i1Var.c;
                        List listO2 = trustedUser.o();
                        arrayList3 = new ArrayList(q7h.U(listO2, 10));
                        while (r9.hasNext()) {
                            qg01Var.getClass();
                            switch (qg01Var.ordinal()) {
                                case 0:
                                case 9:
                                    lwg1Var = lwg1.a;
                                    break;
                                case 1:
                                    lwg1Var = lwg1.b;
                                    break;
                                case 2:
                                    lwg1Var = lwg1.c;
                                    break;
                                case 3:
                                    lwg1Var = lwg1.d;
                                    break;
                                case 4:
                                    lwg1Var = lwg1.e;
                                    break;
                                case 5:
                                    lwg1Var = lwg1.f;
                                    break;
                                case 6:
                                    lwg1Var = lwg1.g;
                                    break;
                                case 7:
                                    lwg1Var = lwg1.h;
                                    break;
                                case 8:
                                    lwg1Var = lwg1.i;
                                    break;
                                default:
                                    eg.o();
                                    return null;
                            }
                            arrayList3.add(lwg1Var);
                        }
                        iOrdinal = trustedUser.n().ordinal();
                        if (iOrdinal != 0) {
                            i3 = 1;
                        } else {
                            i3 = 1;
                        }
                        lo30Var = new lo30(i3, username3, str3, str4, arrayList3);
                    } else {
                        lo30Var = null;
                    }
                    if (lo30Var != null) {
                        arrayList2.add(lo30Var);
                    }
                }
                return arrayList2;
            }
        }
        b = i2;
        return d9nVar;
    }
}
