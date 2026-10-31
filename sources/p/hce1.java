package p;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.c;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.PlayCommand$Builder;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hce1 implements czh1, Function, iui1, jhh0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public hce1(byte b) {
        this.a = b;
        switch (b) {
            case 15:
                this.b = v8r.q((Object) null);
                this.c = v8r.q((Object) null);
                this.d = v8r.q((Object) null);
                this.e = yv91.a(new j4f1(this, (byte) 26));
                break;
            default:
                this.b = new y36(0);
                this.c = new SparseArray();
                this.d = new q5f0((Object) null);
                this.e = new y36(0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(List list, onm onmVar) {
        zjj1 zjj1Var;
        if (onmVar instanceof zjj1) {
            zjj1Var = (zjj1) onmVar;
            int i = zjj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjj1Var.c = i - Integer.MIN_VALUE;
            } else {
                zjj1Var = new zjj1(this, onmVar);
            }
        } else {
            zjj1Var = new zjj1(this, onmVar);
        }
        Object objJ = zjj1Var.a;
        int i2 = zjj1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (((eu4) this.c).k()) {
                    if (list.isEmpty()) {
                        return new gr3(w7x.a);
                    }
                    vpp0 vpp0Var = (vpp0) this.b;
                    c cVarQ = EsOffline.GetContextsRequest.q();
                    cVarQ.n(list);
                    qoz qozVarN = EsOffline.ContextInfoPolicy.n();
                    qozVarN.n(true);
                    cVarQ.t(qozVarN);
                    Single singleB = vpp0Var.b(cVarQ.build());
                    zjj1Var.c = 1;
                    objJ = fc11.j(singleB, zjj1Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
            EsOffline.GetContextsResponse getContextsResponse = (EsOffline.GetContextsResponse) objJ;
            getContextsResponse.getClass();
            if (getContextsResponse.q() == 0) {
                h290 h290VarP = getContextsResponse.p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : h290VarP) {
                    EsOffline.ContextInfo contextInfo = (EsOffline.ContextInfo) obj;
                    contextInfo.getClass();
                    List<EsOffline.Item> itemsList = contextInfo.getItemsList();
                    if (!(itemsList instanceof Collection) || !itemsList.isEmpty()) {
                        for (EsOffline.Item item : itemsList) {
                            if (item.o() == bpz.c && item.p() == cpz.e) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(((EsOffline.ContextInfo) it.next()).o().getUri());
                }
                return new gr3(hashSet);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    public void B(int i, h541 h541Var) {
        SparseArray sparseArray = (SparseArray) this.c;
        String str = zoi1.a;
        dm5.z(!(sparseArray.indexOfKey(i) >= 0), "Exactly one SampleExporter can be added for each track type.");
        sparseArray.put(i, h541Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r0 == r9) goto L40;
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 java.lang.String, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object C(p.wa71 r11, p.onm r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r1 = r12 instanceof p.x0g1
            if (r1 == 0) goto L14
            r1 = r12
            p.x0g1 r1 = (p.x0g1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L14
            int r2 = r2 - r3
            r1.d = r2
        L12:
            r6 = r1
            goto L1a
        L14:
            p.x0g1 r1 = new p.x0g1
            r1.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r6.b
            int r1 = r6.d
            r2 = 4
            r3 = 3
            r5 = 2
            r7 = 1
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r1 == 0) goto L4c
            if (r1 == r7) goto L48
            if (r1 == r5) goto L40
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L35
            p.hm5.M(r0)
            r7 = r8
            goto Lb1
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L3c:
            p.hm5.M(r0)
            return r0
        L40:
            java.lang.String r1 = r6.a
            p.hm5.M(r0)
            r5 = r0
            r0 = r8
            goto L7e
        L48:
            p.hm5.M(r0)
            return r0
        L4c:
            p.hm5.M(r0)
            java.lang.String r0 = r11.a
            java.util.Set r1 = p.s4b1.f
            p.blc0 r1 = p.blc0.M3
            boolean r1 = p.uic.g(r0, r1)
            if (r1 != 0) goto L71
            r6.a = r8
            r6.d = r7
            r2 = r0
            p.oov r0 = new p.oov
            r5 = 0
            r3 = r8
            r4 = r10
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = p.smo1.s(r0, r6)
            if (r0 != r9) goto L70
            goto Lb0
        L70:
            return r0
        L71:
            r1 = r0
            r0 = r8
            r6.a = r1
            r6.d = r5
            java.lang.Object r5 = r10.D(r1, r6)
            if (r5 != r9) goto L7e
            goto Lb0
        L7e:
            p.q0g1 r5 = (p.q0g1) r5
            if (r5 != 0) goto L97
            r6.a = r0
            r6.d = r3
            r3 = r0
            p.oov r0 = new p.oov
            r5 = 0
            r2 = r1
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = p.smo1.s(r0, r6)
            if (r0 != r9) goto L96
            goto Lb0
        L96:
            return r0
        L97:
            r7 = r0
            java.lang.String r0 = r5.b
            p.jo70 r3 = r5.a
            java.lang.String r3 = r3.b
            r6.a = r7
            r6.d = r2
            r2 = r0
            p.oov r0 = new p.oov
            r5 = 0
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = p.smo1.s(r0, r6)
            if (r0 != r9) goto Lb1
        Lb0:
            return r9
        Lb1:
            r1 = r0
            p.p0g1 r1 = (p.p0g1) r1
            java.lang.String r1 = r1.c
            if (r1 == 0) goto Lb9
            return r0
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hce1.C(p.wa71, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(String str, onm onmVar) throws Throwable {
        z0g1 z0g1Var;
        jo70 m231Var;
        io70 io70Var;
        if (onmVar instanceof z0g1) {
            z0g1Var = (z0g1) onmVar;
            int i = z0g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0g1Var.c = i - Integer.MIN_VALUE;
            } else {
                z0g1Var = new z0g1(this, onmVar);
            }
        } else {
            z0g1Var = new z0g1(this, onmVar);
        }
        Object objL = z0g1Var.a;
        int i2 = z0g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                Set set = s4b1.f;
                if (uic.g(str, blc0.M3)) {
                    Observable map = ((uu00) this.b).b(new oi("music_clip_share", false, new ysf1(str, (byte) 4))).filter(b4x0.T0).map(new xrh(str, (byte) 9));
                    z0g1Var.c = 1;
                    objL = fc11.l(map, 1, (Object) null, z0g1Var);
                    d9n d9nVar = d9n.a;
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
            m231Var = (jo70) ((tv00) objL).b;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        jo70 jo70Var = m231Var;
        if (jo70Var != null && (io70Var = jo70Var.e) != null) {
            String str2 = io70Var.b;
            Set set2 = s4b1.f;
            if (uic.x(str2).c == blc0.ti) {
                return new q0g1(str2, jo70Var);
            }
        }
        return null;
    }

    public void E(ijf1 ijf1Var, Object obj, Object obj2) {
        hrr0 hrr0Var = (hrr0) this.d;
        int iOrdinal = ijf1Var.ordinal();
        if (iOrdinal == 0) {
            ((hrr0) this.b).setValue(obj);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            ((hrr0) this.c).setValue(obj);
        }
        if (obj == null || hrr0Var.getValue() != null) {
            return;
        }
        hrr0Var.setValue(obj2);
    }

    public void a() {
        uoa uoaVar = (uoa) this.e;
        if (uoaVar != null) {
            uoaVar.f();
        } else {
            u890.C("betamaxPlayer");
            throw null;
        }
    }

    public Object apply(Object obj) {
        PreparePlayOptions preparePlayOptionsBuild;
        j9u0 i9u0Var;
        String str;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                rn51 rn51Var = (sn51) this.d;
                String str2 = (String) obj2;
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                boolean zJ = u890.j(contextTrack != null ? contextTrack.uri() : null, str2);
                jwe1 jwe1Var = (jwe1) this.c;
                if (zJ) {
                    if (rn51Var instanceof rn51) {
                        i9u0Var = new j9u0(SeekToCommand.Builder.builder().creatorTimestampPositionMs(rn51Var.a).build());
                    } else {
                        if (!(rn51Var instanceof qn51)) {
                            eg.o();
                            return null;
                        }
                        i9u0Var = new i9u0(((qn51) rn51Var).a);
                    }
                    return jwe1Var.c.a(i9u0Var).flatMap(new dn81((Object) jwe1Var, (byte) 19)).ignoreElement();
                }
                if (rn51Var instanceof rn51) {
                    preparePlayOptionsBuild = PreparePlayOptions.builder().seekToCreatorTimestamp(String.valueOf(rn51Var.a)).build();
                } else {
                    if (!(rn51Var instanceof qn51)) {
                        eg.o();
                        return null;
                    }
                    preparePlayOptionsBuild = PreparePlayOptions.builder().seekTo(Long.valueOf(((qn51) rn51Var).a)).build();
                }
                tv80 tv80Var = (tv80) this.e;
                muz muzVar = jwe1Var.a;
                PlayCommand$Builder playCommand$BuilderOptions = PlayCommand.builder(Context.fromUri(str2), PlayOrigin.create(jwe1Var.d.a)).options(preparePlayOptionsBuild);
                if (tv80Var != null) {
                    playCommand$BuilderOptions = playCommand$BuilderOptions.loggingParams(LoggingParams.builder().interactionId(tv80Var.a.a).build());
                }
                return muzVar.a(playCommand$BuilderOptions.build()).ignoreElement();
            default:
                d8n0 d8n0Var = (d8n0) obj;
                s4b1 s4b1Var = (s4b1) this.c;
                qwf1 qwf1Var = (qwf1) obj2;
                if (d8n0Var instanceof a8n0) {
                    String strConcat = "spotify:internal:music-video-prerelease:".concat(s4b1Var.h());
                    Set set = s4b1.f;
                    return Single.just(new ern0(uic.x(strConcat)));
                }
                if (d8n0Var instanceof c8n0) {
                    return qwf1Var.e(s4b1Var);
                }
                if (!(d8n0Var instanceof b8n0)) {
                    eg.o();
                    return null;
                }
                if (!qwf1Var.t.a || (str = (String) this.d) == null) {
                    return !qwf1Var.h.a() ? qwf1Var.d(s4b1Var) : qwf1Var.b(s4b1Var).flatMap(new pwf1(qwf1Var, s4b1Var));
                }
                return yoi1.h(hno1.i(qwf1Var.i, "track-route-group", str), o6x.a).z().onErrorReturnItem(Boolean.FALSE).observeOn(qwf1Var.c).flatMap(new lvc1(qwf1Var, (Intent) this.e, s4b1Var, (byte) 22));
        }
    }

    public mr20 c() {
        return new m441(new q721((Object) this, (lnm) null, (byte) 20));
    }

    public void d() {
        uoa uoaVar = (uoa) this.e;
        if (uoaVar != null) {
            uoaVar.l();
        } else {
            u890.C("betamaxPlayer");
            throw null;
        }
    }

    public void dispose() {
        uoa uoaVar = (uoa) this.e;
        if (uoaVar == null) {
            u890.C("betamaxPlayer");
            throw null;
        }
        ((woa) this.c).c(uoaVar);
        uoa uoaVar2 = (uoa) this.e;
        if (uoaVar2 != null) {
            uoaVar2.i();
        } else {
            u890.C("betamaxPlayer");
            throw null;
        }
    }

    public long e(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        int iB = oe5Var.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((pe5) this.b).get(i).d(oe5Var.a(i), oe5Var2.a(i), oe5Var3.a(i)));
        }
        return jMax;
    }

    public oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        oe5 oe5VarC = (oe5) this.d;
        if (oe5VarC == null) {
            oe5VarC = oe5Var3.c();
            this.d = oe5VarC;
        }
        int iB = oe5VarC.b();
        int i = 0;
        while (true) {
            oe5 oe5Var4 = (oe5) this.d;
            if (i >= iB) {
                if (oe5Var4 != null) {
                    return oe5Var4;
                }
                u890.C("velocityVector");
                throw null;
            }
            if (oe5Var4 == null) {
                u890.C("velocityVector");
                throw null;
            }
            long j2 = j;
            oe5Var4.e(((pe5) this.b).get(i).b(oe5Var.a(i), oe5Var2.a(i), oe5Var3.a(i), j2), i);
            i++;
            j = j2;
        }
    }

    public void i(Parcelable parcelable, Parcelable parcelable2, Enum r4) {
        ((hrr0) this.b).setValue(parcelable);
        ((hrr0) this.c).setValue(parcelable2);
        ((hrr0) this.d).setValue(r4);
    }

    public void j() {
        uoa uoaVar = (uoa) this.e;
        if (uoaVar != null) {
            uoaVar.h(new o2u0((String) this.b, 14, (Map) null), new oot0(0L, 0L, true, false, (hu7) null, (tne1) null, false, 251));
        } else {
            u890.C("betamaxPlayer");
            throw null;
        }
    }

    public View k(ConstraintLayout constraintLayout) {
        VideoSurfaceView videoSurfaceViewInflate = LayoutInflater.from(constraintLayout.getContext()).inflate(2131626297, (ViewGroup) constraintLayout, false);
        videoSurfaceViewInflate.setScaleType(b3k1.c);
        uoa uoaVarA = woa.a((woa) this.c, "culturalmoments-stories-video-content", (o2u0) null, (w2k1) null, (kma) this.d, (List) null, false, (bas) null, (sn10) null, 1014);
        uoaVarA.p(2);
        uoaVarA.q(true);
        this.e = uoaVarA;
        uoaVarA.d(videoSurfaceViewInflate);
        return videoSurfaceViewInflate;
    }

    public void l() {
        ((hrr0) this.b).setValue((Object) null);
        ((hrr0) this.c).setValue((Object) null);
        ((hrr0) this.d).setValue((Object) null);
    }

    public oe5 m(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        oe5 oe5VarC = (oe5) this.e;
        if (oe5VarC == null) {
            oe5VarC = oe5Var3.c();
            this.e = oe5VarC;
        }
        int iB = oe5VarC.b();
        int i = 0;
        while (true) {
            oe5 oe5Var4 = (oe5) this.e;
            if (i >= iB) {
                if (oe5Var4 != null) {
                    return oe5Var4;
                }
                u890.C("endVelocityVector");
                throw null;
            }
            if (oe5Var4 == null) {
                u890.C("endVelocityVector");
                throw null;
            }
            oe5Var4.e(((pe5) this.b).get(i).c(oe5Var.a(i), oe5Var2.a(i), oe5Var3.a(i)), i);
            i++;
        }
    }

    public oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        oe5 oe5VarC = (oe5) this.c;
        if (oe5VarC == null) {
            oe5VarC = oe5Var.c();
            this.c = oe5VarC;
        }
        int iB = oe5VarC.b();
        int i = 0;
        while (true) {
            oe5 oe5Var4 = (oe5) this.c;
            if (i >= iB) {
                if (oe5Var4 != null) {
                    return oe5Var4;
                }
                u890.C("valueVector");
                throw null;
            }
            if (oe5Var4 == null) {
                u890.C("valueVector");
                throw null;
            }
            long j2 = j;
            oe5Var4.e(((pe5) this.b).get(i).e(oe5Var.a(i), oe5Var2.a(i), oe5Var3.a(i), j2), i);
            i++;
            j = j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(onm onmVar) {
        bnf1 bnf1Var;
        if (onmVar instanceof bnf1) {
            bnf1Var = (bnf1) onmVar;
            int i = bnf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bnf1Var.c = i - Integer.MIN_VALUE;
            } else {
                bnf1Var = new bnf1(this, onmVar);
            }
        } else {
            bnf1Var = new bnf1(this, onmVar);
        }
        Object objY = bnf1Var.a;
        int i2 = bnf1Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objY);
            q8n q8nVar = (q8n) this.e;
            vbc1 vbc1Var = new vbc1(this, lnmVar, (byte) 8);
            bnf1Var.c = 1;
            objY = fn31.Y(q8nVar, vbc1Var, bnf1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return new cnf1((lkd) objY, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable p(String str, onm onmVar) throws Throwable {
        s0g1 s0g1Var;
        String m231Var;
        if (onmVar instanceof s0g1) {
            s0g1Var = (s0g1) onmVar;
            int i = s0g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0g1Var.c = i - Integer.MIN_VALUE;
            } else {
                s0g1Var = new s0g1(this, onmVar);
            }
        } else {
            s0g1Var = new s0g1(this, onmVar);
        }
        Object objA = s0g1Var.a;
        int i2 = s0g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                no7 no7Var = (no7) this.c;
                s0g1Var.c = 1;
                objA = no7Var.a(str, s0g1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (String) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) throws Throwable {
        t0g1 t0g1Var;
        d7u0 m231Var;
        my7 my7Var;
        z1u0 z1u0Var;
        if (onmVar instanceof t0g1) {
            t0g1Var = (t0g1) onmVar;
            int i = t0g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0g1Var.c = i - Integer.MIN_VALUE;
            } else {
                t0g1Var = new t0g1(this, onmVar);
            }
        } else {
            t0g1Var = new t0g1(this, onmVar);
        }
        Object objL = t0g1Var.a;
        int i2 = t0g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                Observable map = ((uu00) this.b).b(new oi("music_clip_share", false, new ysf1(str, (byte) 3))).filter(a4x0.T0).map(new akp1(str, (byte) 12));
                t0g1Var.c = 1;
                objL = fc11.l(map, 1, (Object) null, t0g1Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            m231Var = (d7u0) ((tv00) objL).b;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        d7u0 d7u0Var = m231Var;
        if (d7u0Var == null || (my7Var = (my7) o7h.s0(d7u0Var.a)) == null || (z1u0Var = my7Var.c) == null) {
            return null;
        }
        return new Long(jfv.h(z1u0Var.b) - jfv.h(z1u0Var.a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable r(String str, onm onmVar) throws Throwable {
        u0g1 u0g1Var;
        Boolean m231Var;
        if (onmVar instanceof u0g1) {
            u0g1Var = (u0g1) onmVar;
            int i = u0g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u0g1Var.c = i - Integer.MIN_VALUE;
            } else {
                u0g1Var = new u0g1(this, onmVar);
            }
        } else {
            u0g1Var = new u0g1(this, onmVar);
        }
        Object objJ = u0g1Var.a;
        int i2 = u0g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleA = ((etf1) this.e).a(Collections.singletonList(str));
                u0g1Var.c = 1;
                objJ = fc11.j(singleA, u0g1Var);
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
            m231Var = Boolean.valueOf(!((erq0) objJ).a.isEmpty());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
            return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(String str, onm onmVar) throws Throwable {
        v0g1 v0g1Var;
        String m231Var;
        if (onmVar instanceof v0g1) {
            v0g1Var = (v0g1) onmVar;
            int i = v0g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0g1Var.c = i - Integer.MIN_VALUE;
            } else {
                v0g1Var = new v0g1(this, onmVar);
            }
        } else {
            v0g1Var = new v0g1(this, onmVar);
        }
        Object objB = v0g1Var.a;
        int i2 = v0g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                ko71 ko71Var = (ko71) this.d;
                v0g1Var.c = 1;
                objB = ko71Var.b(str, v0g1Var);
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
            m231Var = (String) objB;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public xbk1 t(String str, tka0 tka0Var) {
        xbk1 xbk1Var;
        xbk1 xbk1VarB;
        synchronized (((rtw0) this.e)) {
            try {
                xbk1Var = (xbk1) ((rck1) this.b).a.get(str);
                if (tka0Var.m(xbk1Var)) {
                    gck1 gck1Var = (eck1) this.c;
                    if (gck1Var instanceof gck1) {
                        xbk1Var.getClass();
                        gck1Var.d(xbk1Var);
                    }
                } else {
                    wcn0 wcn0Var = new wcn0((esn) this.d);
                    wcn0Var.a(hck1.b, str);
                    eck1 eck1Var = (eck1) this.c;
                    try {
                        try {
                            xbk1VarB = eck1Var.a(tka0Var, wcn0Var);
                        } catch (AbstractMethodError unused) {
                            xbk1VarB = eck1Var.b(((wdg) tka0Var).n());
                        }
                    } catch (AbstractMethodError unused2) {
                        xbk1VarB = eck1Var.c(((wdg) tka0Var).n(), wcn0Var);
                    }
                    xbk1Var = xbk1VarB;
                    xbk1 xbk1Var2 = (xbk1) ((rck1) this.b).a.put(str, xbk1Var);
                    if (xbk1Var2 != null) {
                        xbk1Var2.Q();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xbk1Var;
    }

    public void u(ejo1 ejo1Var) {
        ksk0 ksk0Var = (ksk0) this.e;
        r6h1 r6h1Var = ksk0Var.b;
        y6h1 y6h1Var = ksk0Var.c;
        i8h1 i8h1Var = (i8h1) this.d;
        boolean z = ejo1Var instanceof snh1;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("page_header", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            ((iu30) this.b).invoke(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis()), (xj61) null).a.a);
            return;
        }
        if (!(ejo1Var instanceof rnh1)) {
            eg.o();
            return;
        }
        Function0 function0 = (Function0) this.c;
        if (function0 != null) {
            function0.invoke();
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("page_header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
        x6h1VarC4.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
    }

    public boolean v() {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((mgg1) arrayList.get(i)).b == -1) {
                return false;
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mgg1 mgg1Var = (mgg1) arrayList.get(i2);
            if (mgg1Var.b != mgg1Var.a.size()) {
                return false;
            }
        }
        return true;
    }

    public void w(List list) {
        String strI;
        FrameLayout frameLayout = (FrameLayout) this.b;
        if (frameLayout.getParent() == null) {
            return;
        }
        ((dgz0) this.e).a((TranscriptListView) this.c, frameLayout, new h5a1(this, (byte) 15), wbx0.U0, 2).g(pfz0.b);
        ArrayList arrayList = ((c8b1) this.d).a;
        arrayList.clear();
        List<vv31> list2 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (vv31 vv31Var : list2) {
            if (vv31Var instanceof vv31) {
                vv31 vv31Var2 = vv31Var;
                strI = vv31Var2.b;
                String str = vv31Var2.c;
                if (!ihc1.y0(str)) {
                    strI = f4i1.f(strI, " • ", str);
                }
                if (strI.length() > 20) {
                    strI = strI.substring(0, 20).concat("…");
                }
            } else {
                strI = vv31Var instanceof uv31 ? bbp1.i(((uv31) vv31Var).a) : "";
            }
            arrayList2.add(strI);
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(wa71 wa71Var, onm onmVar) throws Throwable {
        w0g1 w0g1Var;
        q0g1 q0g1Var;
        Serializable serializableR;
        if (onmVar instanceof w0g1) {
            w0g1Var = (w0g1) onmVar;
            int i = w0g1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0g1Var.d = i - Integer.MIN_VALUE;
            } else {
                w0g1Var = new w0g1(this, onmVar);
            }
        } else {
            w0g1Var = new w0g1(this, onmVar);
        }
        Object objD = w0g1Var.b;
        int i2 = w0g1Var.d;
        Serializable serializable = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            String str = wa71Var.a;
            w0g1Var.d = 1;
            objD = D(str, w0g1Var);
            if (objD != serializable) {
            }
            return serializable;
        }
        if (i2 == 1) {
            hm5.M(objD);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objD);
                    return objD;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q0g1Var = w0g1Var.a;
            hm5.M(objD);
        }
        if (objD == null) {
            return Boolean.TRUE;
        }
        String str2 = q0g1Var.b;
        w0g1Var.a = null;
        w0g1Var.d = 3;
        serializableR = r(str2, w0g1Var);
        if (serializableR != serializable) {
            return serializable;
        }
        return serializableR;
        q0g1Var = (q0g1) objD;
        if (q0g1Var == null) {
            return Boolean.FALSE;
        }
        String str3 = q0g1Var.b;
        w0g1Var.a = q0g1Var;
        w0g1Var.d = 2;
        objD = s(str3, w0g1Var);
        if (objD != serializable) {
            if (objD == null) {
                return Boolean.TRUE;
            }
            String str4 = q0g1Var.b;
            w0g1Var.a = null;
            w0g1Var.d = 3;
            serializableR = r(str4, w0g1Var);
            if (serializableR != serializable) {
                return serializableR;
            }
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r9 != 13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (r0.a(r4, r1) == r7) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y(java.lang.String r9, p.onm r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            p.a4q0 r0 = (p.a4q0) r0
            boolean r1 = r10 instanceof p.itg1
            if (r1 == 0) goto L17
            r1 = r10
            p.itg1 r1 = (p.itg1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            p.itg1 r1 = new p.itg1
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.b
            int r2 = r1.d
            r3 = 6
            p.gtg1 r4 = p.gtg1.i
            r5 = 1
            r6 = 2
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r6) goto L32
            p.hm5.M(r10)
            goto Lbe
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L39:
            int r9 = r1.a
            p.hm5.M(r10)
            goto L9c
        L3f:
            p.hm5.M(r10)
            java.lang.Object r10 = r8.e
            p.agc0 r10 = (p.agc0) r10
            r10.getClass()
            java.lang.String r10 = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ"
            boolean r10 = r9.equals(r10)
            r2 = 0
            if (r10 == 0) goto L53
            goto L90
        L53:
            java.lang.String r10 = "spotify:collection:tracks"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L5c
            goto L90
        L5c:
            java.lang.String r10 = "spotify:internal:collection:tracks"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L65
            goto L90
        L65:
            java.lang.String r10 = "spotify:user:"
            boolean r10 = p.nhc1.Y(r9, r10, r2)
            if (r10 == 0) goto L76
            java.lang.String r10 = ":collection"
            boolean r10 = p.nhc1.R(r9, r10, r2)
            if (r10 == 0) goto L76
            goto L90
        L76:
            p.y6b1 r10 = new p.y6b1     // Catch: java.lang.Exception -> Lbe
            r10.<init>(r9, r2)     // Catch: java.lang.Exception -> Lbe
            p.v6b1 r9 = r10.c     // Catch: java.lang.Exception -> Lbe
            int r9 = r9.ordinal()     // Catch: java.lang.Exception -> Lbe
            if (r9 == r3) goto L90
            r10 = 78
            if (r9 == r10) goto L90
            r10 = 12
            if (r9 == r10) goto L90
            r10 = 13
            if (r9 == r10) goto L90
            goto Lbe
        L90:
            r1.a = r2
            r1.d = r5
            java.lang.Object r10 = r0.d(r4, r1)
            if (r10 != r7) goto L9b
            goto Lbd
        L9b:
            r9 = r2
        L9c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbe
            java.lang.Object r10 = r8.c
            p.drj0 r10 = (p.drj0) r10
            p.ymg1 r2 = new p.ymg1
            r2.<init>(r8, r3)
            boolean r8 = r10.m(r6, r2)
            if (r8 == 0) goto Lbe
            r1.a = r9
            r1.d = r6
            java.lang.Object r8 = r0.a(r4, r1)
            if (r8 != r7) goto Lbe
        Lbd:
            return r7
        Lbe:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hce1.y(java.lang.String, p.onm):java.lang.Object");
    }

    public ezc z(String str) {
        return yoi1.g(g7h.d((g7h) this.c, "", new String[]{str}).doOnError(new f93(str, (byte) 10)).onErrorComplete().map(new gap1(str, (byte) 16)).distinctUntilChanged());
    }

    public hce1(sok0 sok0Var, xq60 xq60Var) {
        this.a = (byte) 0;
        this.b = sok0Var;
        this.c = xq60Var;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.d = dt71VarE;
        this.e = dt71VarE;
    }

    public hce1(Handler handler, yqg yqgVar, fgs0 fgs0Var) {
        this.a = (byte) 23;
        this.b = handler;
        this.c = yqgVar;
        this.d = fgs0Var;
        this.e = new ConcurrentHashMap();
    }

    public hce1(vi11 vi11Var, g2z g2zVar, vnd1 vnd1Var, n0v0 n0v0Var, xy41 xy41Var) {
        this.a = (byte) 3;
        this.b = vi11Var;
        this.c = g2zVar;
        this.d = vnd1Var;
        this.e = n0v0Var;
    }

    public hce1(String str, woa woaVar, kma kmaVar) {
        this.a = (byte) 22;
        this.b = str;
        this.c = woaVar;
        this.d = kmaVar;
    }

    public hce1(a4q0 a4q0Var, drj0 drj0Var, lzn0 lzn0Var, agc0 agc0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 13;
        this.b = a4q0Var;
        this.c = drj0Var;
        this.d = lzn0Var;
        this.e = agc0Var;
    }

    public hce1(Flowable flowable, Scheduler scheduler, g510 g510Var, x610 x610Var) {
        this.a = (byte) 6;
        this.b = flowable;
        this.c = scheduler;
        this.d = g510Var;
        this.e = x610Var.a();
    }

    public hce1(li0 li0Var, av0 av0Var, fv0 fv0Var) {
        this.a = (byte) 20;
        any anyVar = fv0Var.d;
        this.b = li0Var;
        this.c = av0Var;
        this.d = fv0Var;
        this.e = anyVar;
    }

    public hce1(vpp0 vpp0Var, eu4 eu4Var, q8n q8nVar) {
        this.a = (byte) 24;
        this.b = vpp0Var;
        this.c = eu4Var;
        this.d = q8nVar;
        this.e = new cp81(this, (byte) 10);
    }

    public /* synthetic */ hce1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public hce1(rck1 rck1Var, eck1 eck1Var, esn esnVar) {
        this.a = (byte) 28;
        this.b = rck1Var;
        this.c = eck1Var;
        this.d = esnVar;
        this.e = new rtw0((byte) 20);
    }

    public hce1(t4h1 t4h1Var) {
        this.a = (byte) 16;
        this.b = yv91.a(new q4h1(t4h1Var, (byte) 6));
        this.c = yv91.a(new q4h1(t4h1Var, (byte) 5));
        this.d = yv91.a(new q4h1(t4h1Var, (byte) 4));
        this.e = t4h1Var.e;
    }

    public hce1(b3k b3kVar) {
        this.a = (byte) 10;
        this.b = new ArrayList();
        for (int i = 0; i < ((b380) b3kVar.b).size(); i++) {
            ((ArrayList) this.b).add(new mgg1());
        }
        this.c = new SparseArray();
        this.d = new SparseBooleanArray();
        this.e = new SparseIntArray();
    }

    public hce1(pe5 pe5Var) {
        this.a = (byte) 19;
        this.b = pe5Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hce1(uq20 uq20Var) {
        this(new a1g1(uq20Var, (byte) 7));
        this.a = (byte) 19;
    }
}
