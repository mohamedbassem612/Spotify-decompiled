package p;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.agentgateway.v1.Action;
import com.spotify.agentgateway.v1.AgentMessage;
import com.spotify.agentgateway.v1.AvailablePersona;
import com.spotify.agentgateway.v1.Content;
import com.spotify.agentgateway.v1.ContentUris;
import com.spotify.agentgateway.v1.Conversation;
import com.spotify.agentgateway.v1.ConversationEvent;
import com.spotify.agentgateway.v1.ConversationStarter;
import com.spotify.agentgateway.v1.ConversationStarterIntent;
import com.spotify.agentgateway.v1.ConversationStarterIntentGroup;
import com.spotify.agentgateway.v1.CreateConversationResponse;
import com.spotify.agentgateway.v1.CuratedUris;
import com.spotify.agentgateway.v1.GetConversationListResponse;
import com.spotify.agentgateway.v1.GetConversationResponse;
import com.spotify.agentgateway.v1.GetConversationStartersResponse;
import com.spotify.agentgateway.v1.GetProgressStagesResponse;
import com.spotify.agentgateway.v1.ImageAttachment;
import com.spotify.agentgateway.v1.Message;
import com.spotify.agentgateway.v1.PlayAction;
import com.spotify.agentgateway.v1.PlaylistRestorePoint;
import com.spotify.agentgateway.v1.PlaylistUpdate;
import com.spotify.agentgateway.v1.PlaylistUpdateUndoneEvent;
import com.spotify.agentgateway.v1.PlaylistUpdatedEvent;
import com.spotify.agentgateway.v1.ProgressStage;
import com.spotify.agentgateway.v1.SendMessageResponse;
import com.spotify.agentgateway.v1.UpdateNotification;
import com.spotify.agentgateway.v1.UserContext;
import com.spotify.agentgateway.v1.UserMessage;
import com.spotify.mobius.Next;
import com.spotify.player.esperanto.proto.EsPreparePlay;
import com.spotify.player.model.command.PreparePlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dug {
    public static b180 a;
    public static b180 b;

    public static final ConversationEvent A(upf upfVar) {
        cxu0 cxu0Var;
        tzm tzmVarN = ConversationEvent.n();
        if (upfVar instanceof hs2) {
            dxu0 dxu0VarN = PlaylistUpdatedEvent.n();
            hs2 hs2Var = (hs2) upfVar;
            dxu0VarN.q(hs2Var.d);
            dxu0VarN.r(hs2Var.e);
            int iC = l1d.C(hs2Var.f);
            if (iC == 0) {
                cxu0Var = cxu0.ACTION_ADD_TRACK;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                cxu0Var = cxu0.ACTION_REMOVE_TRACK;
            }
            dxu0VarN.n(cxu0Var);
            tzmVarN.q(dxu0VarN);
        } else {
            if (!(upfVar instanceof gs2)) {
                eg.o();
                return null;
            }
            bxu0 bxu0VarN = PlaylistUpdateUndoneEvent.n();
            gs2 gs2Var = (gs2) upfVar;
            bxu0VarN.q(gs2Var.d);
            byte[] bArrDecode = Base64.getUrlDecoder().decode(gs2Var.e);
            hhc hhcVar = phc.b;
            bxu0VarN.n(phc.e(0, bArrDecode, bArrDecode.length));
            byte[] bArrDecode2 = Base64.getUrlDecoder().decode(gs2Var.f);
            bxu0VarN.r(phc.e(0, bArrDecode2, bArrDecode2.length));
            tzmVarN.n(bxu0VarN);
        }
        return (ConversationEvent) tzmVarN.build();
    }

    public static final ImageAttachment B(ts2 ts2Var) {
        ir70 ir70VarN = ImageAttachment.n();
        byte[] bArr = ts2Var.a;
        hhc hhcVar = phc.b;
        ir70VarN.n(phc.e(0, bArr, bArr.length));
        ir70VarN.q();
        return (ImageAttachment) ir70VarN.build();
    }

    public static final UserContext C(ot2 ot2Var) {
        y7i1 y7i1VarY = UserContext.y();
        String str = ot2Var.a;
        if (str != null) {
            y7i1VarY.r(str);
        }
        String str2 = ot2Var.b;
        if (str2 != null) {
            y7i1VarY.q(str2);
        }
        String str3 = ot2Var.c;
        if (str3 != null) {
            y7i1VarY.t(str3);
        }
        Integer num = ot2Var.d;
        if (num != null) {
            y7i1VarY.u(num.intValue());
        }
        Boolean bool = ot2Var.e;
        if (bool != null) {
            y7i1VarY.s(bool.booleanValue());
        }
        String str4 = ot2Var.f;
        if (str4 != null) {
            y7i1VarY.n(str4);
        }
        return y7i1VarY.build();
    }

    public static final UserMessage D(tt2 tt2Var) {
        zdi1 zdi1VarR = UserMessage.r();
        zdi1VarR.n(tt2Var.a);
        ot2 ot2Var = tt2Var.b;
        if (ot2Var != null) {
            zdi1VarR.q(C(ot2Var));
        }
        return (UserMessage) zdi1VarR.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public static final ArrayList E(List list) {
        w80 w80Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -900525660) {
                if (iHashCode != -225849715) {
                    if (iHashCode == 371771984 && str.equals("ACTION_TYPE_PLAY")) {
                        w80Var = w80.c;
                    } else {
                        w80Var = null;
                    }
                } else if (str.equals("ACTION_TYPE_NAVIGATE")) {
                    w80Var = w80.d;
                } else {
                    w80Var = null;
                }
            } else if (str.equals("ACTION_TYPE_DOWNLOAD")) {
                w80Var = w80.e;
            } else {
                w80Var = null;
            }
            if (w80Var != null) {
                arrayList.add(w80Var);
            }
        }
        return arrayList;
    }

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1461007587);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = uyn1.y(qim0Var3, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            qim0 qim0VarR = u291.r(qim0Var3, 24.0f);
            ilx ilxVar = ilx.c;
            uwr uwrVar = cbx.a;
            w0h1.a(ilxVar, isl.a, qim0VarR, cbx.a(b0kVar2).c.f, 0L, false, b0kVar2, ilx.d | 48, 48);
            op71.g(b0kVar2, u291.r(qim0Var3, 8.0f));
            b0kVar2 = b0kVar2;
            uwo1.e(str, null, cbx.d(b0kVar2).j, 0L, null, null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2042);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 13);
        }
    }

    public static final void b(ghm0 ghm0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1021100181);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ghm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            irn1.u(null, null, null, null, apo.r(-40349380, new w3q0(ghm0Var, iu30Var, (byte) 1), x340Var), x340Var, 24576, 15);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(ghm0Var, iu30Var, qim0Var2, i, (byte) 10);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1220371925);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131961333);
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(24.0f, 0.0f, 2, qim0Var3);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new us21(function0, (byte) 9);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarJ, false, null, null, null, (Function0) objT, 15);
            boolean zG = x340Var.g(strO0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new sc21(strO0, (byte) 11);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO1 = cwl1.o0(x340Var, 2131963477);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            qim0Var2 = qim0Var3;
            lee1 lee1Var = cbx.d(x340Var).k;
            zsc zscVar = zex.a;
            uwo1.e(strO1, qim0VarB2, lee1Var, ((vex) zscVar.b).l, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            eox eoxVar = eox.c;
            cvx cvxVar2 = cbx.b(x340Var).b;
            w0h1.a(eoxVar, isl.a, u291.r(qim0Var2, 16.0f), ((vex) zscVar.b).l, 0L, false, x340Var, eox.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var2, i, (byte) 20);
        }
    }

    public static final boolean d(v8l1 v8l1Var) {
        return v8l1Var.b == null;
    }

    public static qim0 e(qim0 qim0Var, Brush brush, hw61 hw61Var, float f, int i) {
        if ((i & 2) != 0) {
            hw61Var = d4o1.a;
        }
        hw61 hw61Var2 = hw61Var;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return qim0Var.then(new sx9(0L, brush, f, hw61Var2, 1));
    }

    public static final qim0 f(qim0 qim0Var, long j, hw61 hw61Var) {
        return qim0Var.then(new sx9(j, (Brush) null, 1.0f, hw61Var, 2));
    }

    public static qim0 g(long j, qim0 qim0Var) {
        return f(qim0Var, j, d4o1.a);
    }

    public static final String h(mq70 mq70Var) {
        String str;
        up70 up70VarA = mq70Var.a(vp70.e);
        if (up70VarA == null) {
            up70VarA = (up70) o7h.s0(mq70Var.a);
        }
        if (up70VarA == null || (str = up70VarA.a.a) == null || ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    public static gfb i(pfb pfbVar) {
        return new gfb(true, pfbVar);
    }

    public static final cn j(Function0 function0, iu30 iu30Var) {
        return new cn((Object) iu30Var, (Object) function0, (byte) 27);
    }

    public static int k(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130968582, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static final Object l(Class cls, Map map) {
        Object obj = map.get(cls);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        n9v.h("Trying to access an entry [ ", cls, " ] that was not registered");
        return null;
    }

    public static r4m0 m(String str, String str2) {
        return new r4m0(str, str2);
    }

    public static gfb n() {
        return new gfb(false, (pfb) null);
    }

    public static gfb o(pfb pfbVar) {
        return new gfb(false, pfbVar);
    }

    public static final EsPreparePlay.PreparePlayRequest p(PreparePlayCommand preparePlayCommand) {
        jqz jqzVarN = EsPreparePlay.PreparePlayRequest.n();
        jqzVarN.n(u2o1.i(preparePlayCommand.context()));
        if (preparePlayCommand.options().c()) {
            jqzVarN.q(lyg.A((PreparePlayOptions) preparePlayCommand.options().b()));
        }
        jqzVarN.r(tot0.a(preparePlayCommand.playOrigin()));
        return jqzVarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    public static Next q(q41 q41Var, w01 w01Var) {
        long jLongValue;
        x1d1 x1d1Var;
        u31 u31Var = q41Var.a;
        q41 q41VarA = q41.a(q41Var, new u31(u31Var.a, u31Var.b, w01Var, u31Var.d, u31Var.e), (s31) null, 6);
        u31 u31Var2 = q41VarA.a;
        u31 u31Var3 = u31Var2;
        l3f0 l3f0Var = u31Var3.a;
        if ((l3f0Var instanceof y2f0) || (l3f0Var instanceof z2f0) || (l3f0Var instanceof c3f0)) {
            return v9p1.z(null, l3f0Var, w01Var.a, q41VarA);
        }
        lj01 lj01Var = q41VarA.c.c;
        boolean z = lj01Var instanceof lj01;
        if (z) {
            Map map = lj01Var.c;
            bk8 bk8Var = w01Var.a;
            if (l3f0Var instanceof x2f0) {
                x1d1Var = x1d1.a;
            } else if (l3f0Var instanceof i3f0) {
                x1d1Var = e2d1.a;
            } else if (l3f0Var instanceof b3f0) {
                x1d1Var = a2d1.a;
            } else if (l3f0Var instanceof f3f0) {
                if (bk8Var == bk8.b) {
                    x1d1Var = c2d1.a;
                } else {
                    x1d1Var = null;
                }
            } else if (l3f0Var instanceof v2f0) {
                x1d1Var = w1d1.a;
            } else {
                x1d1Var = null;
            }
            Long l = (Long) map.get(x1d1Var);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        if (z && jLongValue > 0) {
            return Next.i(q41VarA, Collections.singleton(new b1f0(jLongValue, lj01Var.b)));
        }
        if (z && lj01Var.e) {
            return Next.i(q41VarA, Collections.singleton(new a1f0(u31Var3.a, w01Var.a)));
        }
        bk8 bk8Var2 = w01Var.a;
        u31 u31Var4 = u31Var2;
        return Next.i(q41VarA, Collections.singleton(new z0f0(u31Var4.a, u31Var4.b, (xi01) null, bk8Var2)));
    }

    public static void r(View view) {
        rwq0.s(view, new pea(view, (byte) 10));
    }

    public static final hr2 s(AgentMessage agentMessage) {
        gr2 gr2Var;
        String str;
        String str2;
        String str3;
        int iOrdinal;
        ds2 ds2Var;
        h290 h290VarO = agentMessage.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        Iterator it = h290VarO.iterator();
        while (true) {
            String at2Var = null;
            if (!it.hasNext()) {
                h290<Action> h290VarN = agentMessage.n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                for (Action action : h290VarN) {
                    action.getClass();
                    int iN = action.n();
                    int i = iN == 0 ? -1 : ct2.b[l1d.C(iN)];
                    if (i == -1) {
                        gr2Var = new gr2(null, null, null, 7);
                    } else if (i == 1) {
                        PlayAction playActionQ = action.q();
                        String uri = playActionQ.getUri();
                        String strN = playActionQ.t() ? playActionQ.n() : null;
                        Long lValueOf = playActionQ.u() ? Long.valueOf(playActionQ.q()) : null;
                        if (!playActionQ.w() || (iOrdinal = playActionQ.s().ordinal()) == 0) {
                            str = null;
                        } else if (iOrdinal == 1) {
                            str = "TRANSITION_MODE_INSTANT";
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                            str = null;
                        } else {
                            str = "TRANSITION_MODE_SEAMLESS";
                        }
                        h290 h290VarP = playActionQ.p();
                        if (playActionQ.v()) {
                            int iOrdinal2 = playActionQ.r().ordinal();
                            if (iOrdinal2 == 0) {
                                str3 = null;
                            } else if (iOrdinal2 == 1) {
                                str3 = "SHUFFLE_MODE_ON";
                            } else if (iOrdinal2 != 2) {
                                if (iOrdinal2 != 3) {
                                    eg.o();
                                    return null;
                                }
                                str3 = null;
                            } else {
                                str3 = "SHUFFLE_MODE_OFF";
                            }
                            str2 = str3;
                        } else {
                            str2 = null;
                        }
                        gr2Var = new gr2(new xs2(uri, strN, lValueOf, str, h290VarP, str2), null, null, 6);
                    } else if (i == 2) {
                        gr2Var = new gr2(null, new ws2(action.p().getUri()), null, 5);
                    } else if (i != 3) {
                        if (i != 4) {
                            eg.o();
                            return null;
                        }
                        gr2Var = new gr2(null, null, null, 7);
                    } else {
                        gr2Var = new gr2(null, null, new os2(action.o().getUri()), 3);
                    }
                    arrayList2.add(gr2Var);
                }
                String messageId = agentMessage.getMessageId();
                messageId.getClass();
                if (messageId.length() <= 0) {
                    messageId = null;
                }
                return new hr2(messageId, agentMessage.r() ? agentMessage.q() : null, arrayList, arrayList2);
            }
            Content content = (Content) it.next();
            content.getClass();
            int iS = content.s();
            switch (iS != 0 ? ct2.a[l1d.C(iS)] : -1) {
                case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                case 7:
                    ds2Var = new ds2((String) null, (String) null, (es2) null, (ns2) null, (ns2) null, (nt2) null, 63);
                    break;
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                default:
                    eg.o();
                    return null;
                case 1:
                    ds2Var = new ds2(content.p(), (String) null, (es2) null, (ns2) null, (ns2) null, (nt2) null, 62);
                    break;
                case 2:
                    ds2Var = new ds2((String) null, content.r(), (es2) null, (ns2) null, (ns2) null, (nt2) null, 61);
                    break;
                case 3:
                    ContentUris contentUrisO = content.o();
                    h290 urisList = contentUrisO.getUrisList();
                    String strP = contentUrisO.p();
                    strP.getClass();
                    if (strP.length() <= 0) {
                        strP = null;
                    }
                    if (contentUrisO.q()) {
                        PlaylistUpdate playlistUpdateO = contentUrisO.o();
                        String description = playlistUpdateO.getDescription();
                        if (playlistUpdateO.p()) {
                            PlaylistRestorePoint playlistRestorePointO = playlistUpdateO.o();
                            phc phcVarP = playlistRestorePointO.p();
                            if (phcVarP.isEmpty()) {
                                phcVarP = null;
                            }
                            String strEncodeToString = phcVarP != null ? Base64.getUrlEncoder().withoutPadding().encodeToString(phcVarP.t()) : null;
                            if (strEncodeToString != null) {
                                phc phcVarN = playlistRestorePointO.n();
                                if (phcVarN.isEmpty()) {
                                    phcVarN = null;
                                }
                                String strEncodeToString2 = phcVarN != null ? Base64.getUrlEncoder().withoutPadding().encodeToString(phcVarN.t()) : null;
                                if (strEncodeToString2 != null) {
                                    at2Var = new zs2(strEncodeToString, strEncodeToString2);
                                }
                            }
                        }
                        at2Var = new at2(description, at2Var);
                    }
                    ds2Var = new ds2((String) null, (String) null, new es2(urisList, strP, at2Var), (ns2) null, (ns2) null, (nt2) null, 59);
                    break;
                case 4:
                    CuratedUris curatedUrisN = content.n();
                    ds2Var = new ds2((String) null, (String) null, (es2) null, new ns2(curatedUrisN.getUrisList(), curatedUrisN.o()), (ns2) null, (nt2) null, 55);
                    break;
                case 5:
                    CuratedUris curatedUrisQ = content.q();
                    ds2Var = new ds2((String) null, (String) null, (es2) null, (ns2) null, new ns2(curatedUrisQ.getUrisList(), curatedUrisQ.o()), (nt2) null, 47);
                    break;
                case 6:
                    UpdateNotification updateNotificationT = content.t();
                    ds2Var = new ds2((String) null, (String) null, (es2) null, (ns2) null, (ns2) null, new nt2(updateNotificationT.getTitle(), updateNotificationT.getSubtitle(), updateNotificationT.q() ? updateNotificationT.n() : null, updateNotificationT.p()), 31);
                    break;
            }
            arrayList.add(ds2Var);
        }
    }

    public static final ir2 t(AvailablePersona availablePersona) {
        return new ir2(availablePersona.p(), availablePersona.getDisplayName(), availablePersona.n(), availablePersona.o());
    }

    public static final ls2 u(CreateConversationResponse createConversationResponse) {
        String strO = createConversationResponse.o();
        hr2 hr2VarS = createConversationResponse.s() ? s(createConversationResponse.q()) : null;
        String strN = createConversationResponse.r() ? createConversationResponse.n() : null;
        String strP = createConversationResponse.p();
        strP.getClass();
        return new ls2(strO, hr2VarS, strN, strP.length() > 0 ? strP : null);
    }

    public static final ps2 v(GetConversationListResponse getConversationListResponse) {
        h290<Conversation> h290VarN = getConversationListResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (Conversation conversation : h290VarN) {
            conversation.getClass();
            arrayList.add(new fs2(conversation.p(), conversation.n(), conversation.o()));
        }
        String nextPageToken = getConversationListResponse.getNextPageToken();
        nextPageToken.getClass();
        if (nextPageToken.length() <= 0) {
            nextPageToken = null;
        }
        return new ps2(arrayList, nextPageToken);
    }

    public static final qs2 w(GetConversationResponse getConversationResponse) {
        tt2 tt2Var;
        ot2 ot2Var;
        List messagesList = getConversationResponse.getMessagesList();
        ArrayList arrayList = new ArrayList(q7h.U(messagesList, 10));
        Iterator it = messagesList.iterator();
        while (true) {
            Long lValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Message message = (Message) it.next();
            message.getClass();
            if (message.s()) {
                UserMessage userMessageP = message.p();
                String strO = userMessageP.o();
                if (userMessageP.q()) {
                    UserContext userContextP = userMessageP.p();
                    String strP = userContextP.p();
                    strP.getClass();
                    String str = strP.length() > 0 ? strP : null;
                    String strO2 = userContextP.o();
                    strO2.getClass();
                    ot2Var = new ot2(str, strO2.length() > 0 ? strO2 : null, userContextP.w() ? userContextP.s() : null, userContextP.x() ? Integer.valueOf(userContextP.t()) : null, userContextP.v() ? Boolean.valueOf(userContextP.r()) : null, userContextP.u() ? userContextP.n() : null);
                } else {
                    ot2Var = null;
                }
                tt2Var = new tt2(strO, ot2Var);
            } else {
                tt2Var = null;
            }
            hr2 hr2VarS = message.q() ? s(message.n()) : null;
            if (message.r()) {
                lValueOf = Long.valueOf(message.o());
            }
            arrayList.add(new vs2(tt2Var, hr2VarS, lValueOf));
        }
        String nextPageToken = getConversationResponse.getNextPageToken();
        nextPageToken.getClass();
        if (nextPageToken.length() <= 0) {
            nextPageToken = null;
        }
        String strN = getConversationResponse.n();
        strN.getClass();
        return new qs2(nextPageToken, strN.length() > 0 ? strN : null, arrayList);
    }

    public static final rs2 x(GetConversationStartersResponse getConversationStartersResponse) {
        ArrayList arrayList;
        js2 js2Var;
        h290<ConversationStarter> h290VarO = getConversationStartersResponse.o();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
        for (ConversationStarter conversationStarter : h290VarO) {
            conversationStarter.getClass();
            arrayList2.add(new is2(conversationStarter.o(), conversationStarter.getUri(), conversationStarter.n()));
        }
        String strR = getConversationStartersResponse.r();
        strR.getClass();
        String str = strR.length() > 0 ? strR : null;
        Collection<ConversationStarterIntentGroup> collectionP = getConversationStartersResponse.p();
        collectionP.getClass();
        if (collectionP.isEmpty()) {
            collectionP = null;
        }
        if (collectionP != null) {
            arrayList = new ArrayList(q7h.U(collectionP, 10));
            for (ConversationStarterIntentGroup conversationStarterIntentGroup : collectionP) {
                conversationStarterIntentGroup.getClass();
                if (conversationStarterIntentGroup.p()) {
                    ConversationStarterIntent conversationStarterIntentN = conversationStarterIntentGroup.n();
                    js2Var = new js2(conversationStarterIntentN.getId(), conversationStarterIntentN.o());
                } else {
                    js2Var = null;
                }
                h290<ConversationStarter> h290VarO2 = conversationStarterIntentGroup.o();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO2, 10));
                for (ConversationStarter conversationStarter2 : h290VarO2) {
                    conversationStarter2.getClass();
                    arrayList3.add(new is2(conversationStarter2.o(), conversationStarter2.getUri(), conversationStarter2.n()));
                }
                arrayList.add(new ks2(js2Var, arrayList3));
            }
        } else {
            arrayList = null;
        }
        return new rs2(arrayList2, str, arrayList, getConversationStartersResponse.t() ? getConversationStartersResponse.q() : null, getConversationStartersResponse.s() ? getConversationStartersResponse.n() : null);
    }

    public static final ss2 y(GetProgressStagesResponse getProgressStagesResponse) {
        String strO = getProgressStagesResponse.o();
        h290<ProgressStage> h290VarP = getProgressStagesResponse.p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (ProgressStage progressStage : h290VarP) {
            progressStage.getClass();
            arrayList.add(new bt2(progressStage.getName()));
        }
        return new ss2(strO, getProgressStagesResponse.n(), arrayList);
    }

    public static final et2 z(SendMessageResponse sendMessageResponse) {
        return new et2(s(sendMessageResponse.o()), sendMessageResponse.p() ? sendMessageResponse.n() : null);
    }
}
