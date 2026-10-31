package app.p000rive.semantics.compose;

import app.p000rive.semantics.SemanticActionType;
import app.p000rive.semantics.SemanticNodeActions;
import app.p000rive.semantics.SemanticNodeClassificationKt;
import app.p000rive.semantics.SemanticNodeData;
import app.p000rive.semantics.SemanticNodeState;
import app.p000rive.semantics.SemanticRole;
import app.p000rive.semantics.SemanticTreeModel;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.afh0;
import p.b0k;
import p.b261;
import p.b7x;
import p.czo1;
import p.e261;
import p.epo;
import p.fkj0;
import p.gfh0;
import p.h311;
import p.hab0;
import p.hfh0;
import p.hjl;
import p.hmb0;
import p.hzj;
import p.ifh0;
import p.iu30;
import p.jch0;
import p.jjl;
import p.k4p1;
import p.llj;
import p.n511;
import p.nim0;
import p.nko1;
import p.p5t0;
import p.p7h;
import p.p890;
import p.pm31;
import p.q5t0;
import p.q7h;
import p.qim0;
import p.rih1;
import p.rwq;
import p.s161;
import p.sf80;
import p.smc0;
import p.tgp1;
import p.tob1;
import p.u890;
import p.vu30;
import p.x340;
import p.xos0;
import p.y580;
import p.z5c;
import p.zr7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001ag\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lapp/rive/semantics/SemanticTreeModel;", "tree", "Lkotlin/Function1;", "", "Lp/rih1;", "onTap", "onIncrease", "onDecrease", "onRequestFocus", "RiveSemanticsOverlay", "(Lapp/rive/semantics/SemanticTreeModel;Lp/iu30;Lp/iu30;Lp/iu30;Lp/iu30;Lp/b0k;I)V", "Lapp/rive/semantics/compose/RenderSemanticNode;", "node", "RenderSemanticNodeComposable", "(Lapp/rive/semantics/compose/RenderSemanticNode;Lp/iu30;Lp/iu30;Lp/iu30;Lp/iu30;Lp/b0k;I)V", "nodeId", "siblingIndex", "buildRenderableNode", "(IILapp/rive/semantics/SemanticTreeModel;)Lapp/rive/semantics/compose/RenderSemanticNode;", "", "minX", "minY", "maxX", "maxY", "Lp/n511;", "mapRect", "(FFFF)Lp/n511;", "version", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RiveSemanticsOverlayKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void RenderSemanticNodeComposable(final RenderSemanticNode renderSemanticNode, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, b0k b0kVar, int i) {
        iu30 iu30Var5 = iu30Var2;
        iu30 iu30Var6 = iu30Var3;
        iu30 iu30Var7 = iu30Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1220005810);
        int id = renderSemanticNode.getId();
        SemanticNodeActions actions = renderSemanticNode.getActions();
        x340Var.i0(1989183605);
        int i2 = i & 896;
        int i3 = i & 7168;
        int i4 = i & 57344;
        boolean zE = x340Var.e(id) | x340Var.g(actions) | (((i2 ^ 384) > 256 && x340Var.g(iu30Var5)) || (i & 384) == 256) | (((i3 ^ 3072) > 2048 && x340Var.g(iu30Var6)) || (i & 3072) == 2048) | (((i4 ^ 24576) > 16384 && x340Var.g(iu30Var7)) || (i & 24576) == 16384);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            smc0 smc0VarN = k4p1.n();
            if (renderSemanticNode.getActions().getSemanticActions().contains(SemanticActionType.Increase)) {
                smc0VarN.add(new epo("Increase", new RiveSemanticsOverlayKt$RenderSemanticNodeComposable$actions$1$1$1(iu30Var5, renderSemanticNode)));
            }
            if (renderSemanticNode.getActions().getSemanticActions().contains(SemanticActionType.Decrease)) {
                smc0VarN.add(new epo("Decrease", new RiveSemanticsOverlayKt$RenderSemanticNodeComposable$actions$1$1$2(iu30Var6, renderSemanticNode)));
            }
            if (renderSemanticNode.getActions().getCanRequestFocus()) {
                smc0VarN.add(new epo("Focus", new RiveSemanticsOverlayKt$RenderSemanticNodeComposable$actions$1$1$3(iu30Var7, renderSemanticNode)));
            }
            objT = k4p1.k(smc0VarN);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        iu30 iu30Var8 = iu30Var;
        qim0 qim0VarB = s161.b(nim0.a, false, new AnonymousClass1(renderSemanticNode, (List) objT, iu30Var8));
        gfh0 gfh0Var = new gfh0() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt.RenderSemanticNodeComposable.2
            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(p890 p890Var, List list, int i5) {
                return super.maxIntrinsicHeight(p890Var, list, i5);
            }

            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(p890 p890Var, List list, int i5) {
                return super.maxIntrinsicWidth(p890Var, list, i5);
            }

            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public final hfh0 m586measure3p2s80s(ifh0 ifh0Var, List<? extends afh0> list, long j) {
                n511 rect = renderSemanticNode.getRect();
                int iMax = Math.max(1, jch0.U(rect.c - rect.a));
                n511 rect2 = renderSemanticNode.getRect();
                int iMax2 = Math.max(1, jch0.U(rect2.d - rect2.b));
                List<? extends afh0> list2 = list;
                RenderSemanticNode renderSemanticNode2 = renderSemanticNode;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                int i5 = 0;
                for (Object obj : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    afh0 afh0Var = (afh0) obj;
                    RenderSemanticNode renderSemanticNode3 = renderSemanticNode2.getChildren().get(i5);
                    n511 rect3 = renderSemanticNode3.getRect();
                    int iMax3 = Math.max(1, jch0.U(rect3.c - rect3.a));
                    n511 rect4 = renderSemanticNode3.getRect();
                    int iMax4 = Math.max(1, jch0.U(rect4.d - rect4.b));
                    if (!((iMax3 >= 0) & (iMax4 >= 0))) {
                        sf80.a("width and height must be >= 0");
                    }
                    arrayList.add(afh0Var.H(jjl.h(iMax3, iMax3, iMax4, iMax4)));
                    i5 = i6;
                }
                return ifh0Var.S(iMax, iMax2, b7x.a, new AnonymousClass1(arrayList, renderSemanticNode));
            }

            public /* bridge */ /* synthetic */ int minIntrinsicHeight(p890 p890Var, List list, int i5) {
                return super.minIntrinsicHeight(p890Var, list, i5);
            }

            public /* bridge */ /* synthetic */ int minIntrinsicWidth(p890 p890Var, List list, int i5) {
                return super.minIntrinsicWidth(p890Var, list, i5);
            }

            /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RenderSemanticNodeComposable$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/p5t0;", "Lp/rih1;", "invoke", "(Lp/p5t0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass1 extends hab0 implements iu30 {
                final /* synthetic */ RenderSemanticNode $node;
                final /* synthetic */ List<q5t0> $placeables;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(List<? extends q5t0> list, RenderSemanticNode renderSemanticNode) {
                    super(1);
                    this.$placeables = list;
                    this.$node = renderSemanticNode;
                }

                public final void invoke(p5t0 p5t0Var) {
                    List<q5t0> list = this.$placeables;
                    RenderSemanticNode renderSemanticNode = this.$node;
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        RenderSemanticNode renderSemanticNode2 = renderSemanticNode.getChildren().get(i);
                        p5t0Var.f((q5t0) obj, jch0.U(renderSemanticNode2.getRect().a - renderSemanticNode.getRect().a), jch0.U(renderSemanticNode2.getRect().b - renderSemanticNode.getRect().b), 0.0f);
                        i = i2;
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((p5t0) obj);
                    return rih1.a;
                }
            }
        };
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
        nko1.H(gfh0Var, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        llj lljVar = y580.R0;
        if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iHashCode))) {
            z5c.f(iHashCode, x340Var, iHashCode, lljVar);
        }
        nko1.H(qim0VarE, x340Var, y580.Y);
        x340Var.i0(1150022261);
        Iterator<T> it = renderSemanticNode.getChildren().iterator();
        while (it.hasNext()) {
            iu30 iu30Var9 = iu30Var6;
            RenderSemanticNodeComposable((RenderSemanticNode) it.next(), iu30Var8, iu30Var5, iu30Var9, iu30Var7, x340Var, (i & ContentType.LONG_FORM_ON_DEMAND) | 8 | i2 | i3 | i4);
            iu30Var8 = iu30Var;
            iu30Var5 = iu30Var2;
            iu30Var6 = iu30Var3;
            iu30Var7 = iu30Var4;
        }
        x340Var.r(false);
        x340Var.r(true);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new AnonymousClass4(renderSemanticNode, iu30Var, iu30Var2, iu30Var3, iu30Var4, i);
        }
    }

    public static final void RiveSemanticsOverlay(SemanticTreeModel semanticTreeModel, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, b0k b0kVar, int i) {
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(908456139);
        int iRiveSemanticsOverlay$lambda$0 = RiveSemanticsOverlay$lambda$0(rwq.h(semanticTreeModel.getVersionFlow(), x340Var, 8));
        x340Var.i0(2025549375);
        boolean zE = x340Var.e(iRiveSemanticsOverlay$lambda$0);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            obj = objT;
            List<Integer> roots = semanticTreeModel.getRoots();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj2 : roots) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                RenderSemanticNode renderSemanticNodeBuildRenderableNode = buildRenderableNode(((Number) obj2).intValue(), i2, semanticTreeModel);
                if (renderSemanticNodeBuildRenderableNode != null) {
                    arrayList.add(renderSemanticNodeBuildRenderableNode);
                }
                i2 = i3;
            }
            x340Var.s0(arrayList);
            obj = arrayList;
        }
        obj = objT;
        final List list = (List) obj;
        x340Var.r(false);
        qim0 qim0VarB = s161.b(nim0.a, false, C01181.INSTANCE);
        gfh0 gfh0Var = new gfh0() { // from class: app.rive.semantics.compose.RiveSemanticsOverlayKt.RiveSemanticsOverlay.2
            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(p890 p890Var, List list2, int i4) {
                return super.maxIntrinsicHeight(p890Var, list2, i4);
            }

            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(p890 p890Var, List list2, int i4) {
                return super.maxIntrinsicWidth(p890Var, list2, i4);
            }

            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public final hfh0 m590measure3p2s80s(ifh0 ifh0Var, List<? extends afh0> list2, long j) {
                List<? extends afh0> list3 = list2;
                List<RenderSemanticNode> list4 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                int i4 = 0;
                for (Object obj3 : list3) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    afh0 afh0Var = (afh0) obj3;
                    RenderSemanticNode renderSemanticNode = list4.get(i4);
                    n511 rect = renderSemanticNode.getRect();
                    int iMax = Math.max(1, jch0.U(rect.c - rect.a));
                    n511 rect2 = renderSemanticNode.getRect();
                    int iMax2 = Math.max(1, jch0.U(rect2.d - rect2.b));
                    if (!((iMax2 >= 0) & (iMax >= 0))) {
                        sf80.a("width and height must be >= 0");
                    }
                    arrayList2.add(afh0Var.H(jjl.h(iMax, iMax, iMax2, iMax2)));
                    i4 = i5;
                }
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7x.a, new AnonymousClass1(arrayList2, list));
            }

            public /* bridge */ /* synthetic */ int minIntrinsicHeight(p890 p890Var, List list2, int i4) {
                return super.minIntrinsicHeight(p890Var, list2, i4);
            }

            public /* bridge */ /* synthetic */ int minIntrinsicWidth(p890 p890Var, List list2, int i4) {
                return super.minIntrinsicWidth(p890Var, list2, i4);
            }

            /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RiveSemanticsOverlay$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/p5t0;", "Lp/rih1;", "invoke", "(Lp/p5t0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass1 extends hab0 implements iu30 {
                final /* synthetic */ List<q5t0> $placeables;
                final /* synthetic */ List<RenderSemanticNode> $roots;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(List<? extends q5t0> list, List<RenderSemanticNode> list2) {
                    super(1);
                    this.$placeables = list;
                    this.$roots = list2;
                }

                public final void invoke(p5t0 p5t0Var) {
                    List<q5t0> list = this.$placeables;
                    List<RenderSemanticNode> list2 = this.$roots;
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        RenderSemanticNode renderSemanticNode = list2.get(i);
                        p5t0Var.f((q5t0) obj, jch0.U(renderSemanticNode.getRect().a), jch0.U(renderSemanticNode.getRect().b), 0.0f);
                        i = i2;
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((p5t0) obj);
                    return rih1.a;
                }
            }
        };
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
        nko1.H(gfh0Var, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        llj lljVar = y580.R0;
        if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iHashCode))) {
            z5c.f(iHashCode, x340Var, iHashCode, lljVar);
        }
        nko1.H(qim0VarE, x340Var, y580.Y);
        x340Var.i0(-1585505167);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RenderSemanticNodeComposable((RenderSemanticNode) it.next(), iu30Var, iu30Var2, iu30Var3, iu30Var4, x340Var, (i & ContentType.LONG_FORM_ON_DEMAND) | 8 | (i & 896) | (i & 7168) | (57344 & i));
        }
        x340Var.r(false);
        x340Var.r(true);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C01204(semanticTreeModel, iu30Var, iu30Var2, iu30Var3, iu30Var4, i);
        }
    }

    private static final int RiveSemanticsOverlay$lambda$0(tob1 tob1Var) {
        return ((Number) tob1Var.getValue()).intValue();
    }

    private static final RenderSemanticNode buildRenderableNode(int i, int i2, SemanticTreeModel semanticTreeModel) {
        SemanticNodeData semanticNodeDataNodeById = semanticTreeModel.nodeById(i);
        if (semanticNodeDataNodeById == null) {
            return null;
        }
        SemanticNodeState semanticNodeStateMapSemanticNodeState = SemanticNodeClassificationKt.mapSemanticNodeState(semanticNodeDataNodeById.getTraitFlags(), semanticNodeDataNodeById.getStateFlags());
        if (semanticNodeStateMapSemanticNodeState.getHidden()) {
            return null;
        }
        n511 n511VarMapRect = mapRect(semanticNodeDataNodeById.getMinX(), semanticNodeDataNodeById.getMinY(), semanticNodeDataNodeById.getMaxX(), semanticNodeDataNodeById.getMaxY());
        if (n511VarMapRect.c - n511VarMapRect.a <= 0.0f || n511VarMapRect.d - n511VarMapRect.b <= 0.0f) {
            return null;
        }
        List<Integer> children = semanticNodeDataNodeById.getChildren();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : children) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            RenderSemanticNode renderSemanticNodeBuildRenderableNode = buildRenderableNode(((Number) obj).intValue(), i3, semanticTreeModel);
            if (renderSemanticNodeBuildRenderableNode != null) {
                arrayList.add(renderSemanticNodeBuildRenderableNode);
            }
            i3 = i4;
        }
        SemanticRole semanticRoleFromValue = SemanticRole.INSTANCE.fromValue(semanticNodeDataNodeById.getRole());
        return new RenderSemanticNode(semanticNodeDataNodeById.getId(), semanticRoleFromValue, ComposeSemanticNodeMappingKt.toComposeSemanticNodeContainer(semanticRoleFromValue), i2, SemanticNodeClassificationKt.mapSemanticNodeContent(semanticRoleFromValue, semanticNodeDataNodeById.getLabel(), semanticNodeDataNodeById.getValue(), semanticNodeDataNodeById.getHint(), semanticNodeStateMapSemanticNodeState), semanticNodeStateMapSemanticNodeState, SemanticNodeClassificationKt.mapSemanticNodeActions(semanticRoleFromValue, semanticNodeStateMapSemanticNodeState), semanticNodeDataNodeById.getHeadingLevel(), n511VarMapRect, arrayList);
    }

    private static final n511 mapRect(float f, float f2, float f3, float f4) {
        return new n511(Math.min(f, f3), Math.min(f2, f4), Math.max(f, f3), Math.max(f2, f4));
    }

    /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RiveSemanticsOverlay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/e261;", "Lp/rih1;", "invoke", "(Lp/e261;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C01181 extends hab0 implements iu30 {
        public static final C01181 INSTANCE = new C01181();

        public C01181() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e261) obj);
            return rih1.a;
        }

        public final void invoke(e261 e261Var) {
            b261.F(e261Var, true);
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RenderSemanticNodeComposable$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ RenderSemanticNode $node;
        final /* synthetic */ iu30 $onDecrease;
        final /* synthetic */ iu30 $onIncrease;
        final /* synthetic */ iu30 $onRequestFocus;
        final /* synthetic */ iu30 $onTap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenderSemanticNode renderSemanticNode, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, int i) {
            super(2);
            this.$node = renderSemanticNode;
            this.$onTap = iu30Var;
            this.$onIncrease = iu30Var2;
            this.$onDecrease = iu30Var3;
            this.$onRequestFocus = iu30Var4;
            this.$$changed = i;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveSemanticsOverlayKt.RenderSemanticNodeComposable(this.$node, this.$onTap, this.$onIncrease, this.$onDecrease, this.$onRequestFocus, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RiveSemanticsOverlay$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01204 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ iu30 $onDecrease;
        final /* synthetic */ iu30 $onIncrease;
        final /* synthetic */ iu30 $onRequestFocus;
        final /* synthetic */ iu30 $onTap;
        final /* synthetic */ SemanticTreeModel $tree;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01204(SemanticTreeModel semanticTreeModel, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, int i) {
            super(2);
            this.$tree = semanticTreeModel;
            this.$onTap = iu30Var;
            this.$onIncrease = iu30Var2;
            this.$onDecrease = iu30Var3;
            this.$onRequestFocus = iu30Var4;
            this.$$changed = i;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveSemanticsOverlayKt.RiveSemanticsOverlay(this.$tree, this.$onTap, this.$onIncrease, this.$onDecrease, this.$onRequestFocus, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RenderSemanticNodeComposable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/e261;", "Lp/rih1;", "invoke", "(Lp/e261;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ List<epo> $actions;
        final /* synthetic */ RenderSemanticNode $node;
        final /* synthetic */ iu30 $onTap;

        /* JADX INFO: renamed from: app.rive.semantics.compose.RiveSemanticsOverlayKt$RenderSemanticNodeComposable$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00281 extends hab0 implements Function0 {
            final /* synthetic */ RenderSemanticNode $node;
            final /* synthetic */ iu30 $onTap;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00281(iu30 iu30Var, RenderSemanticNode renderSemanticNode) {
                super(0);
                this.$onTap = iu30Var;
                this.$node = renderSemanticNode;
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m585invoke() {
                this.$onTap.invoke(Integer.valueOf(this.$node.getId()));
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenderSemanticNode renderSemanticNode, List<epo> list, iu30 iu30Var) {
            super(1);
            this.$node = renderSemanticNode;
            this.$actions = list;
            this.$onTap = iu30Var;
        }

        public final void invoke(e261 e261Var) {
            ComposeSemanticNodeMappingKt.applySemanticNodeContainer(e261Var, this.$node.getContainer());
            ComposeSemanticNodeMappingKt.applySemanticNodeTraversal(e261Var, this.$node.getSiblingIndex());
            ComposeSemanticNodeMappingKt.applySemanticNodeContent(e261Var, this.$node.getContent());
            ComposeSemanticNodeMappingKt.applySemanticNodeState(e261Var, this.$node.getState());
            if (this.$node.getHeadingLevel() > 0) {
                b261.c(e261Var);
            }
            pm31 composeRole = ComposeSemanticNodeMappingKt.toComposeRole(this.$node.getRole());
            if (composeRole != null) {
                b261.x(e261Var, composeRole.a);
            }
            if (this.$node.getActions().getSemanticActions().contains(SemanticActionType.Tap)) {
                b261.g(e261Var, (String) null, new C00281(this.$onTap, this.$node));
            }
            if (this.$actions.isEmpty()) {
                return;
            }
            b261.p(e261Var, this.$actions);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e261) obj);
            return rih1.a;
        }
    }
}
