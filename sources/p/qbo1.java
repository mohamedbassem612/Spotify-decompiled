package p;

import android.app.Activity;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.spotify.base.java.logging.Logger;
import com.spotify.challenges.v1.api.pub.proto.GetSessionResponse;
import com.spotify.challenges.v1.api.pub.proto.SessionInProgressResponse;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlaySessionCommand;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.scrollsita.v1.Section;
import com.spotify.signup.signup.v2.proto.AccountDetails;
import com.spotify.signup.signup.v2.proto.ClientInfo;
import com.spotify.signup.signup.v2.proto.CompleteAccountCreationResponse;
import com.spotify.signup.signup.v2.proto.ConsentFlags;
import com.spotify.signup.signup.v2.proto.CreateAccountResponse;
import com.spotify.signup.signup.v2.proto.EmailAndPasswordIdentifier;
import com.spotify.signup.signup.v2.proto.EmailOtpProvider;
import com.spotify.signup.signup.v2.proto.Error;
import com.spotify.signup.signup.v2.proto.FieldError;
import com.spotify.signup.signup.v2.proto.GoogleProvider;
import com.spotify.signup.signup.v2.proto.GraduationIdentifier;
import com.spotify.signup.signup.v2.proto.IdentityProviderIdentifier;
import com.spotify.signup.signup.v2.proto.InvalidArgument;
import com.spotify.signup.signup.v2.proto.NaverProvider;
import com.spotify.signup.signup.v2.proto.PhoneNumberProvider;
import com.spotify.signup.signup.v2.proto.Tracking;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qbo1 implements Function, Predicate, s2i1, c0g, Init, av30, BiPredicate, BiFunction {
    public final /* synthetic */ byte a;
    public static final qbo1 b = new qbo1(1);
    public static final qbo1 c = new qbo1(3);
    public static final qbo1 d = new qbo1(4);
    public static final qbo1 e = new qbo1(5);
    public static final qbo1 f = new qbo1(6);
    public static final qbo1 g = new qbo1(7);
    public static final qbo1 h = new qbo1(8);
    public static final qbo1 i = new qbo1(9);
    public static final qbo1 t = new qbo1(10);
    public static final qbo1 X = new qbo1(11);
    public static final qbo1 Y = new qbo1(12);
    public static final qbo1 Z = new qbo1(13);
    public static final qbo1 N0 = new qbo1(14);
    public static final qbo1 O0 = new qbo1(15);
    public static final qbo1 P0 = new qbo1(16);
    public static final qbo1 Q0 = new qbo1(17);
    public static final qbo1 R0 = new qbo1(18);
    public static final qbo1 S0 = new qbo1(20);
    public static final qbo1 T0 = new qbo1(21);
    public static final qbo1 U0 = new qbo1(22);
    public static final qbo1 V0 = new qbo1(23);
    public static final qbo1 W0 = new qbo1(24);
    public static final qbo1 X0 = new qbo1(25);
    public static final qbo1 Y0 = new qbo1(26);
    public static final qbo1 Z0 = new qbo1(27);
    public static final qbo1 a1 = new qbo1(28);
    public static final qbo1 b1 = new qbo1(29);

    public /* synthetic */ qbo1(byte b2) {
        this.a = b2;
    }

    public static dp5 a(Activity activity) {
        return new dp5(activity, (byte) 12);
    }

    public static Next b(Error error, q41 q41Var, int i2) {
        r31 q31Var;
        bk8 bk8Var;
        int iR = error.r();
        switch (iR == 0 ? -1 : i21.a[l1d.C(iR)]) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
                q31Var = new q31(error.getTitle(), error.n());
                break;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
                InvalidArgument invalidArgumentQ = error.q();
                String title = error.getTitle();
                h290 h290VarO = invalidArgumentQ.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                Iterator it = h290VarO.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FieldError) it.next()).getMessage());
                }
                h290 h290VarO2 = invalidArgumentQ.o();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO2, 10));
                Iterator it2 = h290VarO2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((FieldError) it2.next()).n()));
                }
                q31Var = new z21(title, arrayList, arrayList2);
                break;
            case 2:
                q31Var = new w21(error.getTitle(), error.n());
                break;
            case 3:
                q31Var = new o31(error.getTitle(), error.n());
                break;
            case 8:
                q31Var = new n31(error.getTitle(), error.n());
                break;
        }
        r31 r31Var = q31Var;
        w31 w31Var = q41Var.a;
        if (!(((c41) w31Var) instanceof w31)) {
            return Next.h(q41.a(q41Var, (p41) null, new s31(i2, String.valueOf(error.o()), r31Var, (bk8) null, 8), 5));
        }
        hm hmVar = w31Var.a;
        if (hmVar != null) {
            fm fmVar = hmVar.e;
            if (fmVar instanceof yl) {
                bk8Var = bk8.a;
            } else if (fmVar instanceof zl) {
                bk8Var = bk8.N0;
            } else {
                if (!(fmVar instanceof fm)) {
                    eg.o();
                    return null;
                }
                em emVar = fmVar.b;
                if (emVar instanceof bm) {
                    bk8Var = bk8.e;
                } else if (emVar instanceof dm) {
                    bk8Var = bk8.d;
                } else if (emVar instanceof cm) {
                    bk8Var = bk8.g;
                } else {
                    if (!(emVar instanceof am)) {
                        eg.o();
                        return null;
                    }
                    bk8Var = bk8.O0;
                }
            }
        } else {
            bk8Var = null;
        }
        return Next.h(q41.a(q41Var, (p41) null, new s31(i2, String.valueOf(error.o()), r31Var, bk8Var), 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static Next c(q41 q41Var, boolean z, int i2, String str) {
        bk8 bk8Var;
        y21 y21Var = new y21(z);
        u31 u31Var = q41Var.a;
        c41 c41Var = (c41) u31Var;
        if (c41Var instanceof u31) {
            w01 w01Var = u31Var.c;
            if (w01Var != null) {
                bk8Var = w01Var.a;
            } else {
                bk8Var = null;
            }
        } else if (c41Var instanceof v31) {
            w01 w01Var2 = ((v31) u31Var).d;
            if (w01Var2 != null) {
                bk8Var = w01Var2.a;
            } else {
                bk8Var = null;
            }
        } else if (c41Var instanceof t31) {
            bk8Var = ((t31) u31Var).a.a;
        } else {
            bk8Var = null;
        }
        return Next.h(q41.a(q41Var, (p41) null, new s31(i2, str, y21Var, bk8Var), 5));
    }

    public static /* synthetic */ Next d(q41 q41Var, boolean z, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return c(q41Var, z, i2, (i3 & 4) != 0 ? null : "not_set");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:622:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    public static Next f(q41 q41Var, w11 w11Var) {
        bk8 bk8Var;
        bk8 bk8Var2;
        String str;
        epv0 epv0Var;
        ml mlVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        k41 j41Var;
        q41 q41VarA = q41Var;
        a11 a11Var = q41VarA.c;
        w31 w31Var = q41VarA.a;
        if (w11Var instanceof wfg) {
            return Next.h(q41.a(q41VarA, (p41) null, (s31) null, 5));
        }
        if (w11Var instanceof kn00) {
            kn00 kn00Var = (kn00) w11Var;
            return Next.h(q41.a(q41VarA, new g41(kn00Var.a, kn00Var.b), (s31) null, 6));
        }
        if (w11Var instanceof g8o0) {
            return Next.h(q41.a(q41VarA, (p41) null, new s31(0, (String) null, new j31(null), ((g8o0) w11Var).b, 3), 5));
        }
        if (w11Var instanceof l711) {
            if (w31Var instanceof w31) {
                hm hmVar = w31Var.a;
                if (hmVar != null) {
                    yl ylVar = hmVar.e;
                    if (ylVar instanceof yl) {
                        str6 = ylVar.a;
                    } else if (ylVar instanceof zl) {
                        str6 = ((zl) ylVar).a;
                    } else {
                        if (!(ylVar instanceof fm)) {
                            eg.o();
                            return null;
                        }
                        bm bmVar = ((fm) ylVar).b;
                        if (bmVar instanceof bm) {
                            str6 = bmVar.a;
                        } else if (bmVar instanceof dm) {
                            str6 = null;
                        } else if (bmVar instanceof cm) {
                            str6 = ((cm) bmVar).a;
                        } else {
                            if (!(bmVar instanceof am)) {
                                eg.o();
                                return null;
                            }
                            str6 = ((am) bmVar).a;
                        }
                    }
                } else {
                    str6 = null;
                }
            } else if (w31Var instanceof u31) {
                b3f0 b3f0Var = ((u31) w31Var).a;
                if (b3f0Var instanceof b3f0) {
                    str6 = b3f0Var.b;
                } else if (b3f0Var instanceof k3f0) {
                    str6 = ((k3f0) b3f0Var).a;
                } else if (b3f0Var instanceof x2f0) {
                    str6 = ((x2f0) b3f0Var).a;
                } else {
                    str6 = null;
                }
            } else {
                str6 = null;
            }
            w6s w6sVar = a11Var.b;
            if (u890.j(w6sVar, b2d1.a)) {
                j41Var = new k41(str6);
            } else if (u890.j(w6sVar, f2d1.a)) {
                j41Var = new l41(str6);
            } else if (u890.j(w6sVar, c2d1.a)) {
                j41Var = new i41(str6);
            } else {
                if (!u890.j(w6sVar, x1d1.a)) {
                    eg.o();
                    return null;
                }
                j41Var = new j41(str6);
            }
            return Next.h(q41.a(q41VarA, new n41(j41Var), (s31) null, 6));
        }
        String str7 = "";
        if (w11Var instanceof l461) {
            if (!(w31Var instanceof u31)) {
                return Next.h(q41.a(q41VarA, new e41(""), (s31) null, 6));
            }
            f3f0 f3f0Var = ((u31) w31Var).a;
            if (f3f0Var instanceof f3f0) {
                str5 = f3f0Var.b;
            } else if (f3f0Var instanceof h3f0) {
                str5 = null;
            } else if (f3f0Var instanceof b3f0) {
                str5 = ((b3f0) f3f0Var).b;
            } else if (f3f0Var instanceof k3f0) {
                str5 = ((k3f0) f3f0Var).a;
            } else if (f3f0Var instanceof x2f0) {
                str5 = ((x2f0) f3f0Var).a;
            } else if ((f3f0Var instanceof a3f0) || (f3f0Var instanceof d3f0) || (f3f0Var instanceof j3f0) || (f3f0Var instanceof e3f0)) {
                str5 = null;
            } else if (f3f0Var instanceof v2f0) {
                str5 = ((v2f0) f3f0Var).a;
            } else if (f3f0Var instanceof w2f0) {
                str5 = ((w2f0) f3f0Var).a;
            } else {
                if (!(f3f0Var instanceof y2f0) && !(f3f0Var instanceof z2f0) && !(f3f0Var instanceof i3f0) && !(f3f0Var instanceof g3f0) && !(f3f0Var instanceof c3f0)) {
                    eg.o();
                    return null;
                }
                str5 = null;
            }
            return Next.h(q41.a(q41VarA, new e41(str5 != null ? str5 : ""), (s31) null, 6));
        }
        boolean z = w31Var instanceof w31;
        zfg zfgVar = zfg.a;
        c411 c411Var = c411.a;
        boolean zContains = false;
        if (z) {
            if (!(w11Var instanceof mp81)) {
                boolean z2 = w11Var instanceof bq81;
                no81 oo81Var = no81.c;
                if (z2) {
                    uov0 uov0Var = ((bq81) w11Var).a;
                    w31 w31Var2 = w31Var;
                    hm hmVar2 = w31Var2.a;
                    if (hmVar2 == null) {
                        return d(q41VarA, false, 0, 6);
                    }
                    if (uov0Var instanceof uov0) {
                        uov0 uov0Var2 = uov0Var;
                        epv0Var = null;
                        q41VarA = q41.a(q41VarA, w31.a(w31Var2, new epv0(uov0Var2.a, uov0Var2.b), (jj01) null, false, 29), (s31) null, 6);
                    } else {
                        epv0Var = null;
                    }
                    q41 q41VarA2 = q41.a(q41VarA, w31.a(q41VarA.a, epv0Var, epv0Var, true, 15), epv0Var, 6);
                    lj01 lj01Var = a11Var.c;
                    if (lj01Var instanceof lj01) {
                        lj01 lj01Var2 = lj01Var;
                        Set set = lj01Var2.d;
                        fm fmVar = hmVar2.e;
                        boolean z3 = fmVar instanceof yl;
                        y1d1 y1d1Var = y1d1.a;
                        if (z3) {
                            zContains = set.contains(y1d1Var);
                        } else if (fmVar instanceof fm) {
                            em emVar = fmVar.b;
                            if (emVar instanceof dm) {
                                zContains = set.contains(e2d1.a);
                            } else if (emVar instanceof bm) {
                                zContains = set.contains(a2d1.a);
                            } else if (!(emVar instanceof cm)) {
                                if (!(emVar instanceof am)) {
                                    eg.o();
                                    return null;
                                }
                                zContains = set.contains(y1d1Var);
                            }
                        }
                        if (zContains) {
                            oo81Var = new oo81(lj01Var2.a, lj01Var2.b);
                        }
                    }
                    return Next.i(q41VarA2, Collections.singleton(oo81Var));
                }
                if (w11Var instanceof zp81) {
                    zp81 zp81Var = (zp81) w11Var;
                    w31 w31Var3 = w31Var;
                    String str8 = zp81Var.a;
                    Object obj = zp81Var.b;
                    if (obj instanceof m231) {
                        obj = null;
                    }
                    return Next.i(q41.a(q41VarA, w31.a(w31Var3, (epv0) null, new jj01(str8, (String) obj), false, 23), (s31) null, 6), Collections.singleton(oo81Var));
                }
                if (!(w11Var instanceof pp81)) {
                    if (!(w11Var instanceof lp81)) {
                        if (w11Var instanceof scd1) {
                            return w31Var.e ? Next.j() : Next.a(Collections.singleton(bp81.c));
                        }
                        return d(q41VarA, false, 0, 6);
                    }
                    fn2 fn2Var = ((lp81) w11Var).a;
                    if (fn2Var instanceof en2) {
                        return w31Var.a != null ? Next.a(Collections.singleton(po81.c)) : d(q41VarA, false, 0, 6);
                    }
                    if (fn2Var instanceof fn2) {
                        fn2 fn2Var2 = fn2Var;
                        return Next.h(q41.a(q41VarA, (p41) null, new s31(1, (String) null, new v21(fn2Var2.a, fn2Var2.b), (bk8) null, 10), 5));
                    }
                    eg.o();
                    return null;
                }
                w31 w31Var4 = w31Var;
                q41 q41VarA3 = q41.a(q41VarA, w31.a(w31Var4, (epv0) null, (jj01) null, false, 15), (s31) null, 6);
                CreateAccountResponse createAccountResponse = ((pp81) w11Var).a;
                int iP = createAccountResponse.p();
                int i2 = iP == 0 ? -1 : kq81.a[l1d.C(iP)];
                if (i2 != -1) {
                    if (i2 == 1) {
                        return Next.i(new q41(new u31(new f3f0(createAccountResponse.q().o()), true, (w01) null, w31Var4.c, false), (s31) null, a11Var), Collections.singleton(c411Var));
                    }
                    if (i2 == 2) {
                        return b(createAccountResponse.o().o(), q41VarA3, 2);
                    }
                    if (i2 == 3) {
                        String sessionId = createAccountResponse.n().getSessionId();
                        sessionId.getClass();
                        return Next.i(new q41(new b41(sessionId, false), (s31) null, a11Var), Collections.singleton(zfgVar));
                    }
                    if (i2 != 4) {
                        eg.o();
                        return null;
                    }
                }
                return c(q41VarA3, false, 2, "not_set");
            }
            mp81 mp81Var = (mp81) w11Var;
            w31 w31Var5 = w31Var;
            hm hmVar3 = w31Var5.a;
            if (hmVar3 == null) {
                return d(q41VarA, false, 0, 6);
            }
            ll llVarP = AccountDetails.p();
            String str9 = hmVar3.a;
            xl xlVar = hmVar3.d;
            llVarP.n(str9);
            int iC = l1d.C(hmVar3.b);
            if (iC == 0) {
                mlVar = ml.GENDER_UNKNOWN;
            } else if (iC == 1) {
                mlVar = ml.GENDER_MALE;
            } else if (iC == 2) {
                mlVar = ml.GENDER_FEMALE;
            } else if (iC == 3) {
                mlVar = ml.GENDER_NON_BINARY;
            } else if (iC == 4) {
                mlVar = ml.GENDER_OTHER;
            } else {
                if (iC != 5) {
                    eg.o();
                    return null;
                }
                mlVar = ml.GENDER_PREFER_NOT_TO_SAY;
            }
            llVarP.t(mlVar);
            llVarP.r(hmVar3.c);
            yl ylVar2 = hmVar3.e;
            if (ylVar2 instanceof yl) {
                avw avwVarO = EmailAndPasswordIdentifier.o();
                yl ylVar3 = ylVar2;
                avwVarO.n(ylVar3.a);
                avwVarO.q(ylVar3.b);
                llVarP.s(avwVarO);
            } else if (ylVar2 instanceof zl) {
                w850 w850VarN = GraduationIdentifier.n();
                zl zlVar = (zl) ylVar2;
                w850VarN.q(zlVar.c);
                avw avwVarO2 = EmailAndPasswordIdentifier.o();
                avwVarO2.n(zlVar.a);
                avwVarO2.q(zlVar.b);
                w850VarN.n(avwVarO2);
                llVarP.u(w850VarN);
            } else {
                if (!(ylVar2 instanceof fm)) {
                    eg.o();
                    return null;
                }
                eo70 eo70VarN = IdentityProviderIdentifier.n();
                fm fmVar2 = (fm) ylVar2;
                eo70VarN.t(fmVar2.a);
                bm bmVar2 = fmVar2.b;
                if (bmVar2 instanceof dm) {
                    eo70VarN.s(PhoneNumberProvider.n());
                    llVarP.v(eo70VarN);
                } else if (bmVar2 instanceof bm) {
                    i450 i450VarN = GoogleProvider.n();
                    i450VarN.n(bmVar2.a);
                    eo70VarN.q(i450VarN);
                    llVarP.v(eo70VarN);
                } else if (bmVar2 instanceof cm) {
                    qpn0 qpn0VarN = NaverProvider.n();
                    qpn0VarN.n(((cm) bmVar2).a);
                    eo70VarN.r(qpn0VarN);
                    llVarP.v(eo70VarN);
                } else {
                    if (!(bmVar2 instanceof am)) {
                        eg.o();
                        return null;
                    }
                    oxw oxwVarN = EmailOtpProvider.n();
                    oxwVarN.n(((am) bmVar2).a);
                    eo70VarN.n(oxwVarN);
                    llVarP.v(eo70VarN);
                }
            }
            zfl zflVarN = ConsentFlags.n();
            zflVarN.q(BoolValue.p(xlVar.a));
            Boolean bool = xlVar.b;
            if (bool != null) {
                zflVarN.n(BoolValue.p(bool.booleanValue()));
            }
            Boolean bool2 = xlVar.c;
            if (bool2 != null) {
                zflVarN.t(BoolValue.p(bool2.booleanValue()));
            }
            Boolean bool3 = xlVar.d;
            if (bool3 != null) {
                zflVarN.r(BoolValue.p(bool3.booleanValue()));
            }
            Boolean bool4 = xlVar.e;
            if (bool4 != null) {
                zflVarN.s(BoolValue.p(bool4.booleanValue()));
            }
            llVarP.q((ConsentFlags) zflVarN.build());
            AccountDetails accountDetails = (AccountDetails) llVarP.build();
            ClientInfo clientInfo = mp81Var.a;
            a3g1 a3g1VarN = Tracking.n();
            a3g1VarN.q();
            epv0 epv0Var2 = w31Var5.b;
            if (epv0Var2 == null || (str2 = epv0Var2.b) == null) {
                str2 = "";
            }
            a3g1VarN.s(StringValue.r(str2));
            if (epv0Var2 == null || (str3 = epv0Var2.a) == null) {
                str3 = "";
            }
            a3g1VarN.r(StringValue.r(str3));
            if (epv0Var2 != null && (str4 = epv0Var2.a) != null) {
                str7 = str4;
            }
            a3g1VarN.n(StringValue.r(str7));
            return Next.i(q41VarA, Collections.singleton(new ap81(accountDetails, clientInfo, (Tracking) a3g1VarN.build(), w31Var5.d)));
        }
        if (w31Var instanceof b41) {
            boolean z4 = w11Var instanceof qn81;
            y31 y31Var = z31.a;
            if (z4) {
                qn81 qn81Var = (qn81) w11Var;
                String str10 = qn81Var.a;
                if (str10 != null) {
                    b41 b41Var = (b41) w31Var;
                    if (str10.equals(b41Var.a)) {
                        String str11 = qn81Var.b;
                        if (str11 != null) {
                            y31Var = new y31(str11);
                        }
                        return Next.i(q41.a(q41VarA, b41.a(b41Var, y31Var), (s31) null, 6), Collections.singleton(new il40(str10)));
                    }
                }
                return d(q41VarA, false, 7, 4);
            }
            if (w11Var instanceof scd1) {
                b41 b41Var2 = (b41) w31Var;
                a41 a41Var = b41Var2.c;
                if (!(a41Var instanceof x31)) {
                    return b41Var2.b ? Next.a(Collections.singleton(b411.a)) : Next.a(Collections.singleton(zfgVar));
                }
                s21 s21Var = ((x31) a41Var).a;
                return s21Var != null ? Next.h(q41.a(q41VarA, new h41(s21Var), (s31) null, 6)) : Next.a(Collections.singleton(new eyh(b41Var2.a)));
            }
            if (!(w11Var instanceof nn81)) {
                if (!(w11Var instanceof on81)) {
                    if (w11Var instanceof pn81) {
                        return Next.a(Collections.singleton(new ja41(((b41) w31Var).a)));
                    }
                    if (!(w11Var instanceof rn81)) {
                        return d(q41VarA, false, 0, 6);
                    }
                    b41 b41Var3 = (b41) w31Var;
                    return Next.i(q41.a(q41VarA, b41.a(b41Var3, y31Var), (s31) null, 6), Collections.singleton(new il40(b41Var3.a)));
                }
                CompleteAccountCreationResponse completeAccountCreationResponse = ((on81) w11Var).a;
                int iO = completeAccountCreationResponse.o();
                int i3 = iO == 0 ? -1 : tn81.b[l1d.C(iO)];
                if (i3 != -1) {
                    if (i3 == 1) {
                        return Next.i(new q41(new u31(new f3f0(completeAccountCreationResponse.p().o()), true, (w01) null, (n5o) null, false), (s31) null, a11Var), Collections.singleton(c411Var));
                    }
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return b(completeAccountCreationResponse.n().o(), q41VarA, 3);
                        }
                        eg.o();
                        return null;
                    }
                }
                return c(q41VarA, false, 3, "not_set");
            }
            nn81 nn81Var = (nn81) w11Var;
            if (!(nn81Var instanceof mn81)) {
                if (nn81Var instanceof ln81) {
                    int i4 = ((ln81) nn81Var).a;
                    return (i4 == 404 || i4 == 410) ? Next.h(q41.a(q41VarA, (p41) null, new s31(4, "failure", new x21(true), (bk8) null, 8), 5)) : Next.h(q41.a(q41VarA, (p41) null, new s31(4, (String) null, new j31(null), (bk8) null, 10), 5));
                }
                eg.o();
                return null;
            }
            GetSessionResponse getSessionResponse = ((mn81) nn81Var).a;
            int iO2 = getSessionResponse.o();
            int i5 = iO2 == 0 ? -1 : tn81.a[l1d.C(iO2)];
            if (i5 != -1) {
                if (i5 == 1) {
                    SessionInProgressResponse sessionInProgressResponseN = getSessionResponse.n();
                    b41 b41Var4 = (b41) w31Var;
                    a41 a41Var2 = b41Var4.c;
                    if ((a41Var2 instanceof y31) && u890.j(sessionInProgressResponseN.n().n(), ((y31) a41Var2).a)) {
                        return Next.h(q41.a(q41VarA, (p41) null, new s31(6, (String) null, new x21(false), (bk8) null, 10), 5));
                    }
                    r21 r21Var = new r21(sessionInProgressResponseN.n().p().getUrl());
                    return Next.i(a41Var2 instanceof z31 ? q41.a(q41VarA, new h41(r21Var), (s31) null, 6) : q41.a(q41VarA, b41.a(b41Var4, new x31(r21Var)), (s31) null, 6), Collections.singleton(new ia41(sessionInProgressResponseN.n().n())));
                }
                if (i5 == 2) {
                    return Next.h(q41.a(q41VarA, b41.a((b41) w31Var, new x31(null)), (s31) null, 6));
                }
                if (i5 != 3) {
                    eg.o();
                    return null;
                }
            }
            return d(q41VarA, false, 4, 1);
        }
        if (w31Var instanceof u31) {
            if (w11Var instanceof scd1) {
                w01 w01Var = ((u31) w31Var).c;
                return w01Var == null ? Next.a(Collections.singleton(c411Var)) : Next.a(Collections.singleton(new ka41(w01Var)));
            }
            if (!(w11Var instanceof c1f0)) {
                if (w11Var instanceof qlj0) {
                    w01 w01Var2 = ((qlj0) w11Var).a;
                    return w01Var2 == null ? d(q41VarA, false, 0, 6) : dug.q(q41VarA, w01Var2);
                }
                if (w11Var instanceof umj0) {
                    w01 w01Var3 = ((u31) w31Var).c;
                    if (w01Var3 != null) {
                        return dug.q(q41VarA, w01Var3);
                    }
                    eg.m("Metadata should not be null");
                    return null;
                }
                if (!(w11Var instanceof d1f0)) {
                    return d(q41VarA, false, 0, 6);
                }
                d1f0 d1f0Var = (d1f0) w11Var;
                w01 w01Var4 = ((u31) w31Var).c;
                if (w01Var4 == null) {
                    return d(q41VarA, false, 0, 6);
                }
                String str12 = d1f0Var.a;
                Object obj2 = d1f0Var.b;
                u31 u31Var = (u31) w31Var;
                return Next.i(q41VarA, Collections.singleton(new z0f0(u31Var.a, u31Var.b, new xi01(str12, (String) (obj2 instanceof m231 ? null : obj2)), w01Var4.a)));
            }
            c1f0 c1f0Var = (c1f0) w11Var;
            u31 u31Var2 = (u31) w31Var;
            w01 w01Var5 = u31Var2.c;
            l3f0 l3f0Var = u31Var2.a;
            if (w01Var5 == null) {
                return d(q41VarA, false, 0, 6);
            }
            bk8 bk8Var3 = w01Var5.a;
            jh8 jh8Var = c1f0Var.a;
            if (jh8Var instanceof jh8) {
                zxo1 zxo1Var = jh8Var.a;
                boolean z5 = u31Var2.b;
                v31 v31Var = w31Var instanceof v31 ? (v31) w31Var : null;
                return Next.i(new q41(new v31(v31Var != null ? v31Var.a : null, l3f0Var, Boolean.valueOf(z5), w01Var5, zxo1Var instanceof rf8), (s31) null, a11Var), Collections.singleton(new jxe0(zxo1Var, new uxe0(l3f0Var, z5))));
            }
            if (!(jh8Var instanceof qh8)) {
                if (jh8Var instanceof rh8) {
                    sq81 sq81Var = ((rh8) jh8Var).a;
                    return v9p1.w(new rq81(sq81Var.h, sq81Var.i), l3f0Var, bk8Var3, q41VarA);
                }
                if (jh8Var instanceof sh8) {
                    di8 di8Var = ((sh8) jh8Var).a;
                    return Next.i(new q41(new t31(w01Var5, u31Var2.b, di8Var.a, l3f0Var, new ri8(di8Var.c.b), di8Var, u31Var2.d), (s31) null, a11Var), Collections.singleton(new ni8(di8Var)));
                }
                eg.o();
                return null;
            }
            mh8 mh8Var = (qh8) jh8Var;
            if (mh8Var instanceof kh8) {
                if ((l3f0Var instanceof v2f0) || (l3f0Var instanceof w2f0)) {
                    return Next.h(q41.a(q41VarA, new g41(false, pn00.b), (s31) null, 6));
                }
                return l3f0Var instanceof a3f0 ? Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, new l31(z1d1.a), (bk8) null, 10), 5)) : Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, new a31(bk8Var3), (bk8) null, 10), 5));
            }
            if (mh8Var instanceof mh8) {
                return ((l3f0Var instanceof v2f0) || (l3f0Var instanceof w2f0)) ? d(q41VarA, true, 0, 6) : Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, new j31(mh8Var.a.a), bk8Var3, 2), 5));
            }
            if (mh8Var instanceof lh8) {
                return u31Var2.e ? Next.h(q41.a(q41VarA, new g41(false, sn00.b), (s31) null, 6)) : Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, b31.a, (bk8) null, 10), 5));
            }
            if (mh8Var instanceof nh8) {
                return Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, new g31(e31.a), (bk8) null, 10), 5));
            }
            if (mh8Var instanceof ph8) {
                return ((l3f0Var instanceof v2f0) || (l3f0Var instanceof w2f0)) ? Next.h(q41.a(q41VarA, new g41(false, rn00.b), (s31) null, 6)) : Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, new p31(((ph8) mh8Var).a.a), (bk8) null, 10), 5));
            }
            if (!(mh8Var instanceof oh8)) {
                eg.o();
                return null;
            }
            if ((l3f0Var instanceof v2f0) || (l3f0Var instanceof w2f0)) {
                return d(q41VarA, true, 0, 6);
            }
            return Next.h(q41.a(q41VarA, (p41) null, new s31(5, (String) null, new j31(403), w01Var5 != null ? w01Var5.a : null, 2), 5));
        }
        if (w31Var instanceof v31) {
            return tx9.v(q41Var, w11Var);
        }
        if (!(w31Var instanceof t31)) {
            return Next.j();
        }
        t31 t31Var = q41VarA.a;
        if (w11Var instanceof scd1) {
            di8 di8Var2 = t31Var.f;
            return di8Var2 != null ? Next.a(Collections.singleton(new ni8(di8Var2))) : Next.j();
        }
        if (w11Var instanceof qi8) {
            t31 t31Var2 = t31Var;
            return Next.h(q41.a(q41VarA, new f41(t31Var2.a, t31Var2.b, t31Var2.g), (s31) null, 6));
        }
        if (!(w11Var instanceof pi8)) {
            return Next.j();
        }
        ml8 ml8Var = ((pi8) w11Var).a;
        if (ml8Var instanceof kl8) {
            return Next.j();
        }
        if (ml8Var instanceof ll8) {
            t31 t31Var3 = t31Var;
            boolean z6 = t31Var3.b;
            String str13 = t31Var3.c;
            l3f0 l3f0Var2 = t31Var3.d;
            w01 w01Var6 = t31Var3.a;
            if (l3f0Var2 instanceof a3f0) {
                str = "facebook";
            } else if (l3f0Var2 instanceof b3f0) {
                str = "googleSignIn";
            } else if (l3f0Var2 instanceof f3f0) {
                str = "oneTimeToken";
            } else if (l3f0Var2 instanceof h3f0) {
                str = "authnPlatform";
            } else if (l3f0Var2 instanceof j3f0) {
                str = "samsungsignin";
            } else if (l3f0Var2 instanceof e3f0) {
                str = "naver";
            } else if ((l3f0Var2 instanceof k3f0) || (l3f0Var2 instanceof x2f0) || (l3f0Var2 instanceof v2f0) || (l3f0Var2 instanceof w2f0) || (l3f0Var2 instanceof y2f0) || (l3f0Var2 instanceof z2f0)) {
                str = "password";
            } else if (l3f0Var2 instanceof d3f0) {
                str = "identityless";
            } else if (l3f0Var2 instanceof i3f0) {
                str = "phoneNumber";
            } else if (l3f0Var2 instanceof g3f0) {
                str = "parentChild";
            } else if (l3f0Var2 instanceof c3f0) {
                str = "graduation";
            } else {
                eg.o();
            }
            return Next.a(Collections.singleton(new oi8(new ck8(str13, str, w01Var6.a, z6))));
        }
        if (!(ml8Var instanceof ml8)) {
            eg.o();
            return null;
        }
        yg8 yg8Var = ml8Var.a;
        switch (yg8Var.ordinal()) {
            case 0:
                return d(q41VarA, false, 0, 6);
            case 1:
                return d(q41VarA, false, 0, 6);
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                m31 m31Var = new m31(yg8Var.name());
                c41 c41Var = (c41) t31Var;
                if (c41Var instanceof u31) {
                    w01 w01Var7 = ((u31) t31Var).c;
                    if (w01Var7 != null) {
                        bk8Var = w01Var7.a;
                        bk8Var2 = bk8Var;
                    } else {
                        bk8Var2 = null;
                    }
                } else if (c41Var instanceof v31) {
                    w01 w01Var8 = ((v31) t31Var).d;
                    if (w01Var8 != null) {
                        bk8Var = w01Var8.a;
                        bk8Var2 = bk8Var;
                    } else {
                        bk8Var2 = null;
                    }
                } else if (c41Var instanceof t31) {
                    bk8Var = t31Var.a.a;
                    bk8Var2 = bk8Var;
                } else {
                    bk8Var2 = null;
                }
                return Next.h(q41.a(q41VarA, (p41) null, new s31(0, (String) null, m31Var, bk8Var2, 3), 5));
            case 6:
                return d(q41VarA, true, 0, 6);
            default:
                eg.o();
                break;
        }
        return null;
    }

    public Object apply(Object obj) {
        m510 m510Var;
        List list;
        byte b2 = this.a;
        z6x z6xVar = z6x.a;
        switch (b2) {
            case 3:
                return z6xVar;
            case 4:
                Logger.d("Failed to authorize alexa %s", new Object[]{(Throwable) obj});
                return i2b1.a;
            case 5:
                return ((PlayerState) obj).track();
            case 6:
            case 9:
            case 11:
            case 14:
            case 17:
            case 19:
            case 22:
            case 26:
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
            default:
                vrc0 vrc0Var = (vrc0) o7h.s0((List) obj);
                return vrc0Var != null ? vrc0Var.a : "";
            case 7:
                wuz wuzVar = (wuz) obj;
                PlaySessionCommand playSessionCommandCreate = PlaySessionCommand.create();
                tpz tpzVarN = EsPlay.PlayPreparedRequest.n();
                tpzVarN.s(wuzVar.c);
                tpzVarN.n(tgp1.s(wuzVar.b.a(playSessionCommandCreate.loggingParams())));
                if (playSessionCommandCreate.playOptions().c()) {
                    tpzVarN.r(j1p1.v((PlayOptions) playSessionCommandCreate.playOptions().b()));
                    tpzVarN.q(l6p1.h(((PlayOptions) playSessionCommandCreate.playOptions().b()).commandOptions()));
                }
                wuzVar.d = true;
                return wuzVar.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "PlayPrepared", tpzVarN.build()).map(drm0.R0).map(xbp1.c1);
            case 8:
                EsStoredUserInfo.NullableStoredUserInfo nullableStoredUserInfo = (EsStoredUserInfo.NullableStoredUserInfo) obj;
                return nullableStoredUserInfo.p() ? new li8(new di8(nullableStoredUserInfo.o().getUsername(), (wd) null, new of8(nullableStoredUserInfo.o().getUsername(), nullableStoredUserInfo.o().n().o().o().t()))) : ki8.a;
            case 10:
                return (ContextTrack) ((spq0) obj).b();
            case 12:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                int i2 = ry21Var.a().c;
                long jCurrentTimeMillis = (System.currentTimeMillis() - ry21Var.Z) / 1000;
                if (ry21Var.i != null) {
                    m510Var = m510.c;
                } else {
                    m510Var = (ry21Var.t == null || jCurrentTimeMillis > ((long) i2)) ? m510.a : m510.b;
                }
                q310 q310Var = (q310) sy21Var.b;
                return (q310Var == null || (list = q310Var.a) == null) ? new l510(z6xVar, m510Var, (String) null) : new l510(list, m510Var, (String) null);
            case 13:
                mdz mdzVar = (mdz) o7h.s0((List) obj);
                String str = mdzVar != null ? mdzVar.s : null;
                return str == null ? "" : str;
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionDecorateResponse.u(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionDecorateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                return new rwo0((qwh) obj);
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 20:
                return ((c481) obj).a;
            case 21:
                e2z e2zVar = (e2z) obj;
                return new mmr0(e2zVar.g, e2zVar.f);
            case 23:
                return ((gkf1) obj).a;
            case 24:
                return new n9u(((Boolean) obj).booleanValue());
            case 25:
                return new gwu((Map) obj, b7x.a);
            case 28:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
        }
    }

    public mr20 e(boolean z) {
        return new huz(Boolean.valueOf(z), (byte) 10);
    }

    public First e0(Object obj) {
        return First.b((uel) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new nab(xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                return ((String) obj).length() > 0;
            default:
                return !((uv00) obj).f;
        }
    }

    public boolean test(Object obj, Object obj2) {
        return ((kx7) obj).a.equals(((kx7) obj2).a);
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        return new b6z(y7y0.t("has-podcasts-available", map), y7y0.x(map), ((Boolean) obj2).booleanValue());
    }
}
