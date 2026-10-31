package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dfh implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ dfh(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    public final void accept(Object obj) {
        int i;
        wgh xghVar;
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                alh alhVar = (hlh) obj;
                alhVar.getClass();
                zeh zehVar = null;
                if (!(alhVar instanceof ykh)) {
                    boolean z = alhVar instanceof blh;
                    zeh zehVar2 = reh.a;
                    if (!z) {
                        if (alhVar instanceof wkh) {
                            zehVar = zehVar2;
                        } else if (alhVar instanceof clh) {
                            zehVar = weh.a;
                        } else if (alhVar instanceof alh) {
                            zehVar = new ueh(alhVar.d);
                        } else if (alhVar instanceof flh) {
                            flh flhVar = (flh) alhVar;
                            pkh pkhVar = flhVar.c;
                            String strY = y2o1.y(pkhVar);
                            zehVar = new yeh(strY != null ? strY : "", flhVar.e, flhVar.d, y2o1.z(pkhVar));
                        } else if (alhVar instanceof glh) {
                            glh glhVar = (glh) alhVar;
                            pkh pkhVar2 = glhVar.c;
                            String strY2 = y2o1.y(pkhVar2);
                            zehVar = new zeh(strY2 != null ? strY2 : "", glhVar.d, y2o1.z(pkhVar2));
                        } else if (!alhVar.equals(vkh.a) && !(alhVar instanceof xkh) && !(alhVar instanceof zkh) && !(alhVar instanceof elh) && !alhVar.equals(dlh.a)) {
                            eg.o();
                        }
                        break;
                    } else {
                        pkh pkhVar3 = ((blh) alhVar).a;
                        if (pkhVar3 instanceof ikh) {
                            String strY3 = y2o1.y(pkhVar3);
                            zehVar = new veh(strY3 != null ? strY3 : "");
                        } else {
                            zehVar = zehVar2;
                        }
                    }
                } else {
                    pkh pkhVar4 = ((ykh) alhVar).c;
                    String strY4 = y2o1.y(pkhVar4);
                    if (pkhVar4 instanceof ekh) {
                        Comment comment = ((ekh) pkhVar4).b;
                        int iP = comment.p();
                        i = iP != 0 ? hb00.a[l1d.C(iP)] : -1;
                        xghVar = i != 1 ? i != 2 ? null : new wgh(comment.B().o(), comment.B().p()) : new xgh(comment.E().getUsername(), comment.E().q(), comment.E().p());
                    } else if (!(pkhVar4 instanceof hkh)) {
                        if (!(pkhVar4 instanceof ikh) && !(pkhVar4 instanceof kkh) && !(pkhVar4 instanceof nkh) && !(pkhVar4 instanceof okh) && !(pkhVar4 instanceof gkh) && !pkhVar4.equals(jkh.b) && !pkhVar4.equals(lkh.b) && !(pkhVar4 instanceof mkh)) {
                            eg.o();
                        }
                        break;
                    } else {
                        Reply reply = ((hkh) pkhVar4).b;
                        int iN = reply.n();
                        i = iN != 0 ? hb00.b[l1d.C(iN)] : -1;
                        if (i == 1) {
                            xghVar = new xgh(reply.x().getUsername(), reply.x().q(), reply.x().p());
                        } else if (i == 2) {
                            xghVar = new wgh(reply.v().o(), reply.v().p());
                        }
                    }
                    if (strY4 != null && xghVar != null) {
                        zehVar = new seh(strY4, xghVar);
                    }
                }
                if (zehVar != null) {
                    iu30Var.invoke(zehVar);
                }
                break;
            default:
                iph iphVar = (iph) obj;
                iphVar.getClass();
                iu30Var.invoke(iphVar);
                break;
        }
    }
}
