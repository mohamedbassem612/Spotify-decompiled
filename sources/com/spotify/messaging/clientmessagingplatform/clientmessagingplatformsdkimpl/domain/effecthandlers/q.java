package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p.eg;
import p.fj30;
import p.gmc;
import p.hhg1;
import p.hxo1;
import p.ij01;
import p.jlc;
import p.mkc;
import p.mmr0;
import p.o7h;
import p.pap1;
import p.q7h;
import p.r7h;
import p.v5j0;
import p.vkc;
import p.vri1;
import p.w5j0;
import p.x5j0;
import p.xj61;
import p.xri1;
import p.y5j0;
import p.yqg;
import p.z5j0;
import p.zkc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q {
    public final ij01 a;
    public final yqg b;

    public q(ij01 ij01Var, yqg yqgVar) {
        this.a = ij01Var;
        this.b = yqgVar;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SelectMessageEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(Observable<mkc> observable) {
                final q qVar = this.this$0;
                return observable.flatMap(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SelectMessageEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final ObservableSource<? extends jlc> apply(mkc mkcVar) {
                        Object zkcVar;
                        T next;
                        SelectMessageEffectHandlerImpl$MessageState.ValidationFailed validationPassed;
                        gmc gmcVar = mkcVar.b;
                        ArrayList arrayList = new ArrayList();
                        List list = mkcVar.c;
                        q qVar2 = qVar;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                final q qVar3 = qVar;
                                List listA1 = o7h.a1(arrayList2, new Comparator() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SelectMessageEffectHandlerImpl$transformer$1$1$apply$$inlined$sortedBy$1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        int priority;
                                        SelectMessageEffectHandlerImpl$MessageState selectMessageEffectHandlerImpl$MessageState = (SelectMessageEffectHandlerImpl$MessageState) t;
                                        int iPriority = selectMessageEffectHandlerImpl$MessageState.priority() * 10;
                                        q qVar4 = qVar3;
                                        Message message = selectMessageEffectHandlerImpl$MessageState.getMessage();
                                        qVar4.getClass();
                                        int priority2 = 9;
                                        if (message instanceof Message.JITMessageStub) {
                                            priority = 9;
                                        } else {
                                            if (!(message instanceof Message.CreativeMessage)) {
                                                eg.o();
                                                return 0;
                                            }
                                            priority = ((Message.CreativeMessage) message).getMessageType().getPriority();
                                        }
                                        Integer numValueOf = Integer.valueOf(priority + iPriority);
                                        SelectMessageEffectHandlerImpl$MessageState selectMessageEffectHandlerImpl$MessageState2 = (SelectMessageEffectHandlerImpl$MessageState) t2;
                                        int iPriority2 = selectMessageEffectHandlerImpl$MessageState2.priority() * 10;
                                        q qVar5 = qVar3;
                                        Message message2 = selectMessageEffectHandlerImpl$MessageState2.getMessage();
                                        qVar5.getClass();
                                        if (!(message2 instanceof Message.JITMessageStub)) {
                                            if (!(message2 instanceof Message.CreativeMessage)) {
                                                eg.o();
                                                return 0;
                                            }
                                            priority2 = ((Message.CreativeMessage) message2).getMessageType().getPriority();
                                        }
                                        return pap1.t(numValueOf, Integer.valueOf(priority2 + iPriority2));
                                    }
                                });
                                arrayList.addAll(listA1);
                                SelectMessageEffectHandlerImpl$MessageState.ValidationFailed validationFailed = (SelectMessageEffectHandlerImpl$MessageState) o7h.s0(listA1);
                                if (validationFailed instanceof SelectMessageEffectHandlerImpl$MessageState.ValidationPassed) {
                                    Message message = ((SelectMessageEffectHandlerImpl$MessageState.ValidationPassed) validationFailed).getMessage();
                                    if (message instanceof Message.JITMessageStub) {
                                        xj61 xj61VarU = fj30.u(gmcVar.b);
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj : arrayList) {
                                            if (obj instanceof SelectMessageEffectHandlerImpl$MessageState.ValidationPassed) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj2 : arrayList3) {
                                            if (((SelectMessageEffectHandlerImpl$MessageState.ValidationPassed) obj2).getMessage() instanceof Message.JITMessageStub) {
                                                arrayList4.add(obj2);
                                            }
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it2 = arrayList4.iterator();
                                        while (it2.hasNext()) {
                                            r7h.W(((SelectMessageEffectHandlerImpl$MessageState.ValidationPassed) it2.next()).getMessage().getTriggers(), arrayList5);
                                        }
                                        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                                        Iterator it3 = arrayList5.iterator();
                                        while (it3.hasNext()) {
                                            arrayList6.add(((Trigger) it3.next()).getPattern());
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj3 : arrayList6) {
                                            if (xj61VarU.a.containsKey((String) obj3)) {
                                                arrayList7.add(obj3);
                                            }
                                        }
                                        zkcVar = new vkc(gmcVar, o7h.p1(arrayList7));
                                    } else {
                                        if (!(message instanceof Message.CreativeMessage)) {
                                            eg.o();
                                            return null;
                                        }
                                        zkcVar = new zkc(gmcVar, new z5j0((Message.CreativeMessage) message));
                                    }
                                } else if (validationFailed instanceof SelectMessageEffectHandlerImpl$MessageState.ValidationFailed) {
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj4 : arrayList) {
                                        if (obj4 instanceof SelectMessageEffectHandlerImpl$MessageState.ValidationFailed) {
                                            arrayList8.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
                                    Iterator it4 = arrayList8.iterator();
                                    while (it4.hasNext()) {
                                        arrayList9.add(((SelectMessageEffectHandlerImpl$MessageState.ValidationFailed) it4.next()).getFailingRules());
                                    }
                                    Iterator it5 = q7h.V(arrayList9).iterator();
                                    if (!it5.hasNext()) {
                                        hhg1.k();
                                        return null;
                                    }
                                    Rule rule = (Rule) it5.next();
                                    while (it5.hasNext()) {
                                        Rule rule2 = (Rule) it5.next();
                                        if (rule.compareTo(rule2) > 0) {
                                            rule = rule2;
                                        }
                                    }
                                    SelectMessageEffectHandlerImpl$MessageState.ValidationFailed validationFailed2 = validationFailed;
                                    Iterator<T> it6 = validationFailed2.getFailureDetails().iterator();
                                    do {
                                        if (!it6.hasNext()) {
                                            next = (T) null;
                                            break;
                                        }
                                        next = it6.next();
                                    } while (((mmr0) next).a != rule);
                                    mmr0 mmr0Var = next;
                                    zkcVar = new zkc(gmcVar, new v5j0(new y5j0(rule, arrayList8.size() == 1 ? validationFailed2.getMessage() : null, mmr0Var != null ? (String) mmr0Var.b : null)));
                                } else if (validationFailed instanceof SelectMessageEffectHandlerImpl$MessageState.Expired) {
                                    zkcVar = new zkc(gmcVar, new v5j0(new w5j0(((SelectMessageEffectHandlerImpl$MessageState.Expired) validationFailed).getMessage())));
                                } else {
                                    if (validationFailed != null) {
                                        eg.o();
                                        return null;
                                    }
                                    zkcVar = new zkc(gmcVar, new v5j0(x5j0.c));
                                }
                                return Observable.just(zkcVar);
                            }
                            Message message2 = (Message) it.next();
                            hxo1 hxo1VarJ = message2 instanceof Message.JITMessageStub ? xri1.c : qVar2.a.j(message2, gmcVar.g.getRules(), gmcVar, mkcVar.d);
                            if (hxo1VarJ instanceof vri1) {
                                vri1 vri1Var = (vri1) hxo1VarJ;
                                validationPassed = new SelectMessageEffectHandlerImpl$MessageState.ValidationFailed(message2, vri1Var.c, vri1Var.d);
                            } else {
                                yqg yqgVar = qVar2.b;
                                if (message2 instanceof Message.CreativeMessage) {
                                    Message.CreativeMessage creativeMessage = (Message.CreativeMessage) message2;
                                    if (creativeMessage.getSource() == MessageSource.PREFETCHED && creativeMessage.getEndTimestamp() < yqgVar.b() / 1000) {
                                        validationPassed = new SelectMessageEffectHandlerImpl$MessageState.Expired(message2);
                                    }
                                } else if (!(message2 instanceof Message.JITMessageStub)) {
                                    eg.o();
                                    return null;
                                }
                                validationPassed = new SelectMessageEffectHandlerImpl$MessageState.ValidationPassed(message2);
                            }
                            arrayList2.add(validationPassed);
                        }
                    }
                });
            }
        };
    }
}
