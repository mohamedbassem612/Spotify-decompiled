package p;

import android.util.Base64;
import com.spotify.passkeys.v1.AuthenticatorSelection;
import com.spotify.passkeys.v1.ExcludedCredential;
import com.spotify.passkeys.v1.PubKeyCredParam;
import com.spotify.passkeys.v1.Signals;
import com.spotify.passkeys.v1.StartAuthenticationRequest;
import com.spotify.passkeys.v1.StartAuthenticationResponse;
import com.spotify.passkeys.v1.StartRegistrationRequest;
import com.spotify.passkeys.v1.StartRegistrationResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t4s0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ tzr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4s0(tzr0 tzr0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = tzr0Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new t4s0(this.c, lnmVar, (byte) 0);
            default:
                return new t4s0(this.c, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String str;
        Object objC;
        ArrayList arrayList;
        gm8 gm8Var;
        String str2;
        String str3;
        String str4;
        String str5;
        jny0 jny0Var;
        wmy0 wmy0Var;
        String str6;
        byte b = this.a;
        jji1 jji1Var = jji1.USER_VERIFICATION_UNSPECIFIED;
        d9n d9nVar = d9n.a;
        int i = 1;
        tzr0 tzr0Var = this.c;
        String str7 = "discouraged";
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    v4s0 v4s0Var = (v4s0) tzr0Var.c;
                    xhb1 xhb1VarO = StartAuthenticationRequest.o();
                    an81 an81VarN = Signals.n();
                    an81VarN.n(((jqt) tzr0Var.d).b());
                    xhb1VarO.n((Signals) an81VarN.build());
                    StartAuthenticationRequest startAuthenticationRequestBuild = xhb1VarO.build();
                    this.b = true;
                    objA = v4s0Var.a(startAuthenticationRequestBuild, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                StartAuthenticationResponse startAuthenticationResponse = (StartAuthenticationResponse) objA;
                yrg0 yrg0Var = (yrg0) tzr0Var.e;
                String strEncodeToString = Base64.encodeToString(startAuthenticationResponse.n().t(), 11);
                String strO = startAuthenticationResponse.o();
                long jP = startAuthenticationResponse.p();
                jji1 jji1VarQ = startAuthenticationResponse.q();
                if (jji1VarQ == jji1Var) {
                    jji1VarQ = null;
                }
                if (jji1VarQ != null) {
                    int iOrdinal = jji1VarQ.ordinal();
                    if (iOrdinal == 1) {
                        str7 = "required";
                    } else if (iOrdinal == 2 || iOrdinal != 3) {
                        str7 = "preferred";
                    }
                    str = str7;
                } else {
                    str = null;
                }
                return new o4s0(((nfa0) yrg0Var.b).b(cny0.Companion.serializer(), new cny0(jP, strEncodeToString, strO, str)), startAuthenticationResponse);
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    v4s0 v4s0Var2 = (v4s0) tzr0Var.c;
                    fkb1 fkb1VarO = StartRegistrationRequest.o();
                    an81 an81VarN2 = Signals.n();
                    an81VarN2.n(((jqt) tzr0Var.d).b());
                    fkb1VarO.n((Signals) an81VarN2.build());
                    StartRegistrationRequest startRegistrationRequestBuild = fkb1VarO.build();
                    this.b = true;
                    objC = v4s0Var2.c(startRegistrationRequestBuild, this);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                StartRegistrationResponse startRegistrationResponse = (StartRegistrationResponse) objC;
                yrg0 yrg0Var2 = (yrg0) tzr0Var.e;
                fny0 fny0Var = new fny0(startRegistrationResponse.s().getId(), startRegistrationResponse.s().getName());
                jny0 jny0Var2 = new jny0(Base64.encodeToString(startRegistrationResponse.u().o().t(), 11), startRegistrationResponse.u().getName(), startRegistrationResponse.u().getDisplayName());
                String strEncodeToString2 = Base64.encodeToString(startRegistrationResponse.p().t(), 11);
                h290<PubKeyCredParam> h290VarR = startRegistrationResponse.r();
                ArrayList arrayList2 = new ArrayList();
                for (PubKeyCredParam pubKeyCredParam : h290VarR) {
                    String str8 = l4s0.a[pubKeyCredParam.o().ordinal()] == 1 ? "public-key" : null;
                    zmy0 zmy0Var = str8 == null ? null : new zmy0(str8, pubKeyCredParam.n());
                    if (zmy0Var != null) {
                        arrayList2.add(zmy0Var);
                    }
                }
                Collection collectionQ = startRegistrationResponse.q();
                collectionQ.getClass();
                if (collectionQ.isEmpty()) {
                    collectionQ = null;
                }
                if (collectionQ != null) {
                    arrayList = new ArrayList();
                    Iterator it = collectionQ.iterator();
                    while (it.hasNext()) {
                        ExcludedCredential excludedCredential = (ExcludedCredential) it.next();
                        String str9 = l4s0.a[excludedCredential.p().ordinal()] == i ? "public-key" : null;
                        if (str9 == null) {
                            jny0Var = jny0Var2;
                            wmy0Var = null;
                        } else {
                            String strEncodeToString3 = Base64.encodeToString(excludedCredential.n().t(), 11);
                            d290 d290VarO = excludedCredential.o();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = d290VarO.iterator();
                            while (it2.hasNext()) {
                                hm8 hm8Var = (hm8) it2.next();
                                hm8Var.getClass();
                                Iterator it3 = it2;
                                int iOrdinal2 = hm8Var.ordinal();
                                jny0 jny0Var3 = jny0Var2;
                                if (iOrdinal2 == 1) {
                                    str6 = "usb";
                                } else if (iOrdinal2 == 2) {
                                    str6 = "nfc";
                                } else if (iOrdinal2 == 3) {
                                    str6 = "ble";
                                } else if (iOrdinal2 != 4) {
                                    str6 = iOrdinal2 != 5 ? null : "hybrid";
                                } else {
                                    str6 = "internal";
                                }
                                if (str6 != null) {
                                    arrayList3.add(str6);
                                }
                                jny0Var2 = jny0Var3;
                                it2 = it3;
                            }
                            jny0Var = jny0Var2;
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            wmy0Var = new wmy0(str9, strEncodeToString3, arrayList3);
                        }
                        if (wmy0Var != null) {
                            arrayList.add(wmy0Var);
                        }
                        it = it;
                        jny0Var2 = jny0Var;
                        i = 1;
                    }
                } else {
                    arrayList = null;
                }
                jny0 jny0Var4 = jny0Var2;
                AuthenticatorSelection authenticatorSelectionO = startRegistrationResponse.o();
                if (authenticatorSelectionO != null) {
                    dm8 dm8VarN = authenticatorSelectionO.n();
                    if (dm8VarN == dm8.AUTHENTICATOR_ATTACHMENT_UNSPECIFIED) {
                        dm8VarN = null;
                    }
                    if (dm8VarN == null) {
                        str4 = null;
                    } else {
                        int iOrdinal3 = dm8VarN.ordinal();
                        if (iOrdinal3 == 1) {
                            str4 = "platform";
                        } else if (iOrdinal3 != 2) {
                            str4 = null;
                        } else {
                            str4 = "cross-platform";
                        }
                    }
                    vs21 vs21VarP = authenticatorSelectionO.p();
                    if (vs21VarP == vs21.RESIDENT_KEY_UNSPECIFIED) {
                        vs21VarP = null;
                    }
                    if (vs21VarP == null) {
                        str5 = null;
                    } else {
                        int iOrdinal4 = vs21VarP.ordinal();
                        if (iOrdinal4 == 1) {
                            str5 = "required";
                        } else if (iOrdinal4 == 2) {
                            str5 = "preferred";
                        } else if (iOrdinal4 != 3) {
                            str5 = null;
                        } else {
                            str5 = "discouraged";
                        }
                    }
                    jji1 jji1VarQ2 = authenticatorSelectionO.q();
                    if (jji1VarQ2 == jji1Var) {
                        jji1VarQ2 = null;
                    }
                    if (jji1VarQ2 != null) {
                        int iOrdinal5 = jji1VarQ2.ordinal();
                        if (iOrdinal5 == 1) {
                            str7 = "required";
                        } else if (iOrdinal5 == 2 || iOrdinal5 != 3) {
                            str7 = "preferred";
                        }
                    } else {
                        str7 = null;
                    }
                    gm8Var = new gm8(str4, str5, str7);
                } else {
                    gm8Var = null;
                }
                am7 am7VarN = startRegistrationResponse.n();
                if (am7VarN == am7.ATTESTATION_UNSPECIFIED) {
                    am7VarN = null;
                }
                if (am7VarN != null) {
                    int iOrdinal6 = am7VarN.ordinal();
                    if (iOrdinal6 == 1) {
                        str3 = "none";
                    } else if (iOrdinal6 == 2) {
                        str3 = "indirect";
                    } else if (iOrdinal6 != 3) {
                        str3 = iOrdinal6 != 4 ? null : "enterprise";
                    } else {
                        str3 = "direct";
                    }
                    str2 = str3;
                } else {
                    str2 = null;
                }
                return new n4s0(((nfa0) yrg0Var2.b).b(tmy0.Companion.serializer(), new tmy0(fny0Var, jny0Var4, strEncodeToString2, arrayList2, arrayList, gm8Var, str2, startRegistrationResponse.t())), startRegistrationResponse);
        }
    }
}
