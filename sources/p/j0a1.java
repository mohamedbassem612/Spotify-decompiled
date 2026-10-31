package p;

import com.spotify.profile.socialgraphimpl.proto.ContainsRelationsResponse$ContainRelationsUsernameRequest;
import com.spotify.profile.socialgraphimpl.proto.ContainsRelationsResponse$ContainRelationsUsernameResponse;
import com.spotify.profile.socialgraphimpl.proto.ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse;
import com.spotify.profile.socialgraphimpl.proto.FriendRequestResponse$FriendResponse;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j0a1 {
    public static final /* synthetic */ mma0[] d = {new cey0(j0a1.class, "socialGraphEndpoint", "getSocialGraphEndpoint()Lcom/spotify/profile/socialgraphimpl/SocialGraphEndpoint;", 0)};
    public final dt71 a;
    public final ve01 b;
    public final t8r0 c;

    public j0a1(caq caqVar) {
        dt71 dt71VarE = mgo1.e(0, 64, 2, 1);
        this.a = dt71VarE;
        this.b = d5p1.g(dt71VarE);
        this.c = new t8r0(new kyk1(caqVar, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        a0a1 a0a1Var;
        sy21 m231Var;
        if (onmVar instanceof a0a1) {
            a0a1Var = (a0a1) onmVar;
            int i = a0a1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0a1Var.d = i - Integer.MIN_VALUE;
            } else {
                a0a1Var = new a0a1(this, onmVar);
            }
        } else {
            a0a1Var = new a0a1(this, onmVar);
        }
        Object objT = a0a1Var.b;
        int i2 = a0a1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objT);
                mz91 mz91VarD = d();
                a0a1Var.a = str2;
                a0a1Var.d = 1;
                objT = mz91VarD.t(str, str2, a0a1Var);
                d9n d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = a0a1Var.a;
                hm5.M(objT);
            }
            m231Var = (sy21) objT;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        sy21 sy21Var = m231Var instanceof m231 ? null : m231Var;
        boolean z = sy21Var != null && sy21Var.a.Q0;
        this.a.a(z ? new tz91(str2) : new sz91(str2));
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, List list, yn11 yn11Var, onm onmVar) {
        b0a1 b0a1Var;
        if (onmVar instanceof b0a1) {
            b0a1Var = (b0a1) onmVar;
            int i = b0a1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0a1Var.c = i - Integer.MIN_VALUE;
            } else {
                b0a1Var = new b0a1(this, onmVar);
            }
        } else {
            b0a1Var = new b0a1(this, onmVar);
        }
        Object objZ = b0a1Var.a;
        int i2 = b0a1Var.c;
        if (i2 == 0) {
            hm5.M(objZ);
            mz91 mz91VarD = d();
            dol dolVarN = ContainsRelationsResponse$ContainRelationsUsernameRequest.n();
            dolVarN.r(str);
            dolVarN.q(yn11Var);
            dolVarN.n(list);
            ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest = (ContainsRelationsResponse$ContainRelationsUsernameRequest) dolVarN.build();
            b0a1Var.c = 1;
            objZ = mz91VarD.z(containsRelationsResponse$ContainRelationsUsernameRequest, b0a1Var);
            d9n d9nVar = d9n.a;
            if (objZ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objZ);
        }
        return ((ContainsRelationsResponse$ContainRelationsUsernameResponse) objZ).n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, onm onmVar) {
        c0a1 c0a1Var;
        sy21 m231Var;
        if (onmVar instanceof c0a1) {
            c0a1Var = (c0a1) onmVar;
            int i = c0a1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0a1Var.d = i - Integer.MIN_VALUE;
            } else {
                c0a1Var = new c0a1(this, onmVar);
            }
        } else {
            c0a1Var = new c0a1(this, onmVar);
        }
        Object objQ = c0a1Var.b;
        int i2 = c0a1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                mz91 mz91VarD = d();
                c0a1Var.a = str2;
                c0a1Var.d = 1;
                objQ = mz91VarD.q(str, str2, c0a1Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = c0a1Var.a;
                hm5.M(objQ);
            }
            m231Var = (sy21) objQ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        sy21 sy21Var = m231Var instanceof m231 ? null : m231Var;
        boolean z = sy21Var != null && sy21Var.a.Q0;
        this.a.a(z ? new vz91(str2) : new uz91(str2));
        return Boolean.valueOf(z);
    }

    public final mz91 d() {
        return (mz91) this.c.f(this, d[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, onm onmVar) {
        d0a1 d0a1Var;
        if (onmVar instanceof d0a1) {
            d0a1Var = (d0a1) onmVar;
            int i = d0a1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0a1Var.c = i - Integer.MIN_VALUE;
            } else {
                d0a1Var = new d0a1(this, onmVar);
            }
        } else {
            d0a1Var = new d0a1(this, onmVar);
        }
        Object objS = d0a1Var.a;
        int i2 = d0a1Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            mz91 mz91VarD = d();
            d0a1Var.c = 1;
            objS = mz91VarD.s(str, str2, d0a1Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        return Boolean.valueOf(((ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse) objS).n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, onm onmVar) {
        e0a1 e0a1Var;
        if (onmVar instanceof e0a1) {
            e0a1Var = (e0a1) onmVar;
            int i = e0a1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0a1Var.c = i - Integer.MIN_VALUE;
            } else {
                e0a1Var = new e0a1(this, onmVar);
            }
        } else {
            e0a1Var = new e0a1(this, onmVar);
        }
        Object objP = e0a1Var.a;
        int i2 = e0a1Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            mz91 mz91VarD = d();
            e0a1Var.c = 1;
            objP = mz91VarD.p(str, str2, e0a1Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        return Boolean.valueOf(((ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse) objP).n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, String str2, onm onmVar) {
        f0a1 f0a1Var;
        if (onmVar instanceof f0a1) {
            f0a1Var = (f0a1) onmVar;
            int i = f0a1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0a1Var.c = i - Integer.MIN_VALUE;
            } else {
                f0a1Var = new f0a1(this, onmVar);
            }
        } else {
            f0a1Var = new f0a1(this, onmVar);
        }
        Object objN = f0a1Var.a;
        int i2 = f0a1Var.c;
        if (i2 == 0) {
            hm5.M(objN);
            mz91 mz91VarD = d();
            f0a1Var.c = 1;
            objN = mz91VarD.n(str, str2, f0a1Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objN);
        }
        return Boolean.valueOf(((ContainsSingleRelationResponseOuterClass$ContainsSingleRelationResponse) objN).n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, vu30 vu30Var, yz91 yz91Var, onm onmVar) {
        g0a1 g0a1Var;
        sy21 m231Var;
        if (onmVar instanceof g0a1) {
            g0a1Var = (g0a1) onmVar;
            int i = g0a1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0a1Var.f = i - Integer.MIN_VALUE;
            } else {
                g0a1Var = new g0a1(this, onmVar);
            }
        } else {
            g0a1Var = new g0a1(this, onmVar);
        }
        Object objA = g0a1Var.d;
        int i2 = g0a1Var.f;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                mz91 mz91VarD = d();
                g0a1Var.a = str2;
                g0a1Var.b = vu30Var;
                g0a1Var.c = yz91Var;
                g0a1Var.f = 1;
                objA = mz91VarD.a(str, str2, g0a1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yz91Var = g0a1Var.c;
                vu30Var = g0a1Var.b;
                str2 = g0a1Var.a;
                hm5.M(objA);
            }
            m231Var = (sy21) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        sy21 sy21Var = m231Var;
        dt71 dt71Var = this.a;
        if (sy21Var == null || !sy21Var.a.Q0) {
            dt71Var.a(yz91Var);
            return Boolean.FALSE;
        }
        FriendRequestResponse$FriendResponse friendRequestResponse$FriendResponse = (FriendRequestResponse$FriendResponse) sy21Var.b;
        String chatUri = friendRequestResponse$FriendResponse != null ? friendRequestResponse$FriendResponse.getChatUri() : null;
        if (friendRequestResponse$FriendResponse == null || !friendRequestResponse$FriendResponse.o() || chatUri == null || chatUri.length() == 0) {
            chatUri = null;
        }
        String strD = chatUri != null ? pcf.d(6, chatUri, (String) null) : null;
        Object rz91Var = (friendRequestResponse$FriendResponse != null && friendRequestResponse$FriendResponse.n() == yn11.RELATION_TYPE_IS_FRIEND) ? new rz91(str2, strD) : (yz91) vu30Var.invoke(str2, strD);
        dt71Var.a(rz91Var);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, String str2, onm onmVar) {
        h0a1 h0a1Var;
        sy21 m231Var;
        if (onmVar instanceof h0a1) {
            h0a1Var = (h0a1) onmVar;
            int i = h0a1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0a1Var.d = i - Integer.MIN_VALUE;
            } else {
                h0a1Var = new h0a1(this, onmVar);
            }
        } else {
            h0a1Var = new h0a1(this, onmVar);
        }
        Object objI = h0a1Var.b;
        int i2 = h0a1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                mz91 mz91VarD = d();
                h0a1Var.a = str2;
                h0a1Var.d = 1;
                objI = mz91VarD.i(str, str2, h0a1Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = h0a1Var.a;
                hm5.M(objI);
            }
            m231Var = (sy21) objI;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        sy21 sy21Var = m231Var instanceof m231 ? null : m231Var;
        boolean z = sy21Var != null && sy21Var.a.Q0;
        this.a.a(z ? new pz91(str2) : new oz91(str2));
        return Boolean.valueOf(z);
    }
}
