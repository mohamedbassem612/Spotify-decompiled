package p;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionAvailability;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionInfoReceiver$Connected;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionInfoReceiver$ConnectionInfo;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionInfoReceiver$ConnectionStatus;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionType$ConnectionType;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y8l extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8l(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 5;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                y8l y8lVar = new y8l(i, (lnm) obj5, (byte) 0);
                y8lVar.b = zBooleanValue;
                y8lVar.e = (l8o0) obj2;
                y8lVar.c = zBooleanValue2;
                y8lVar.d = zBooleanValue3;
                return y8lVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue4 = bool.booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj4).booleanValue();
                y8l y8lVar2 = new y8l(i, (lnm) obj5, (byte) 1);
                y8lVar2.b = zBooleanValue4;
                y8lVar2.e = (Boolean) obj2;
                y8lVar2.c = zBooleanValue5;
                y8lVar2.d = zBooleanValue6;
                return y8lVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus;
        EsConnectionType$ConnectionType esConnectionType$ConnectionType;
        amz amzVar;
        ylz ylzVar;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                l8o0 l8o0Var = (l8o0) this.e;
                boolean z2 = this.c;
                boolean z3 = this.d;
                hm5.M(obj);
                if (l8o0Var instanceof j8o0) {
                    j8o0 j8o0Var = (j8o0) l8o0Var;
                    boolean z4 = j8o0Var.b;
                    boolean z5 = j8o0Var.c;
                    boolean z6 = j8o0Var.d;
                    smc0 smc0VarN = k4p1.n();
                    if (z4) {
                        smc0VarN.add(moz.c);
                    }
                    if (z5) {
                        smc0VarN.add(moz.b);
                    }
                    if (!z5) {
                        smc0VarN.add(moz.d);
                    }
                    if (z6) {
                        smc0VarN.add(moz.e);
                    }
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    boolean z7 = j8o0Var.a;
                    int i = j8o0Var.e;
                    if (z7) {
                        bmz bmzVarN = EsConnectionType$ConnectionType.n();
                        bmzVarN.r(Empty.n());
                        esConnectionType$ConnectionType = (EsConnectionType$ConnectionType) bmzVarN.build();
                    } else if (z4) {
                        int i2 = i == 0 ? -1 : lhy0.b[l1d.C(i)];
                        if (i2 == -1) {
                            amzVar = amz.UNKNOWN_SUBTYPE;
                        } else if (i2 == 1) {
                            amzVar = amz.GPRS;
                        } else if (i2 == 2) {
                            amzVar = amz.EDGE;
                        } else if (i2 == 3) {
                            amzVar = amz.THREE_G;
                        } else if (i2 == 4) {
                            amzVar = amz.FOUR_G;
                        } else {
                            if (i2 != 5) {
                                eg.o();
                                return null;
                            }
                            amzVar = amz.FIVE_G;
                        }
                        bmz bmzVarN2 = EsConnectionType$ConnectionType.n();
                        bmzVarN2.n(amzVar);
                        h hVarBuild = bmzVarN2.build();
                        hVarBuild.getClass();
                        esConnectionType$ConnectionType = (EsConnectionType$ConnectionType) hVarBuild;
                    } else {
                        bmz bmzVarN3 = EsConnectionType$ConnectionType.n();
                        bmzVarN3.q(Empty.n());
                        esConnectionType$ConnectionType = (EsConnectionType$ConnectionType) bmzVarN3.build();
                    }
                    xlz xlzVarN = EsConnectionInfoReceiver$ConnectionStatus.n();
                    vlz vlzVarO = EsConnectionInfoReceiver$Connected.o();
                    ArrayList arrayList = new ArrayList(q7h.U(smc0VarK, 10));
                    rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                    while (true) {
                        rmc0 rmc0Var = rmc0VarListIterator;
                        if (rmc0Var.hasNext()) {
                            arrayList.add(Integer.valueOf(((moz) rmc0Var.next()).getNumber()));
                        } else {
                            vlzVarO.n(arrayList);
                            vlzVarO.q(esConnectionType$ConnectionType);
                            int iC = l1d.C(j8o0Var.f);
                            if (iC == 0) {
                                ylzVar = ylz.OS_INTERNET_VALIDATED;
                            } else if (iC == 1) {
                                ylzVar = ylz.OS_INTERNET_NOT_VALIDATED;
                            } else {
                                if (iC != 2) {
                                    eg.o();
                                    return null;
                                }
                                ylzVar = ylz.OS_INTERNET_VALIDATION_UNKNOWN;
                            }
                            vlzVarO.r(ylzVar);
                            xlzVarN.n(vlzVarO);
                            esConnectionInfoReceiver$ConnectionStatus = (EsConnectionInfoReceiver$ConnectionStatus) xlzVarN.build();
                        }
                    }
                } else {
                    if (!l8o0Var.equals(k8o0.a)) {
                        eg.o();
                        return null;
                    }
                    xlz xlzVarN2 = EsConnectionInfoReceiver$ConnectionStatus.n();
                    xlzVarN2.q(Empty.n());
                    esConnectionInfoReceiver$ConnectionStatus = (EsConnectionInfoReceiver$ConnectionStatus) xlzVarN2.build();
                }
                wlz wlzVarO = EsConnectionInfoReceiver$ConnectionInfo.o();
                wlzVarO.r(z);
                wlzVarO.q(esConnectionInfoReceiver$ConnectionStatus);
                ulz ulzVarR = EsConnectionAvailability.ConnectionAvailability.r();
                ulzVarR.q(z2);
                ulzVarR.n(z3);
                wlzVarO.n(ulzVarR);
                return (EsConnectionInfoReceiver$ConnectionInfo) wlzVarO.build();
            default:
                boolean z8 = this.b;
                Boolean bool = (Boolean) this.e;
                boolean z9 = this.c;
                boolean z10 = this.d;
                hm5.M(obj);
                bool.getClass();
                return new e8y0(z8, (String) null, (String) null, 0, bool.booleanValue(), (Map) null, z9, z10, 110);
        }
    }
}
