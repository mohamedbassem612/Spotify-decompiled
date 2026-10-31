package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative;
import com.spotify.pendragon.v1.proto.InAppMessage;
import com.spotify.pendragon.v1.proto.Trigger;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class ffr implements iu30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ffr(p5 p5Var, gk61 gk61Var, iwu iwuVar, b69 b69Var) {
        this.a = (byte) 5;
        this.b = p5Var;
        this.c = gk61Var;
        this.d = iwuVar;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AssertionError d(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + uoe0.b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((voe0) this.b));
        voe0.d(assertionError);
        return assertionError;
    }

    public AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((voe0) this.b));
        voe0.d(assertionError);
        return assertionError;
    }

    public AssertionError f(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((voe0) this.b), th);
        voe0.d(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    public Object invoke(Object obj) {
        Enum r16;
        byte b = this.a;
        Object obj2 = null;
        AssertionError assertionErrorE = null;
        Enum r4 = null;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                tr3 tr3Var = (tr3) obj;
                w7c0 w7c0Var = tr3Var.c;
                sxc0 sxc0Var = tr3Var.b;
                int iR = ryo1.r(sxc0Var.c);
                boolean zBooleanValue = ((Boolean) ((p5) obj4).invoke(tr3Var)).booleanValue();
                bqq0 bqq0Var = sxc0Var.a;
                c380 c380VarA = mqo1.A(bqq0Var.d);
                qn90 qn90Var = sxc0Var.c;
                c380 c380VarA2 = mqo1.A(ryo1.t(qn90Var));
                List list = sxc0Var.g;
                List list2 = sxc0Var.h;
                boolean z = iR > 0 || !c380VarA2.isEmpty();
                x0x0 x0x0Var = (x0x0) w7c0Var.a(gww0.a);
                Boolean bool = (Boolean) w7c0Var.a(qf90.a);
                boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                lml lmlVarB = bqq0Var.b();
                q160 q160Var = new q160(zBooleanValue, z, x0x0Var, ((evm1) obj5).B(), new uf20(ryo1.u(qn90Var), sxc0Var.b.c, (c380VarA2.isEmpty() && c380VarA.isEmpty()) ? false : true, zBooleanValue2, ((Boolean) w7c0Var.a(fg90.a)).booleanValue() && c380VarA.isEmpty(), lmlVarB != null ? new vod1(0, lmlVarB.a, lmlVarB.b) : null, c380VarA, c380VarA2, list, list2));
                jvc0 jvc0VarA = ((u5s) obj3).a(tr3Var);
                List list3 = jvc0VarA.b;
                mml mmlVar = bqq0Var.e;
                boolean z2 = bqq0Var.h;
                return new qvm1(mmlVar, iR, zBooleanValue, (!(((qn90Var instanceof b8e0) || (qn90Var instanceof on90) || (qn90Var instanceof pn90)) ? true : qn90Var instanceof qn90 ? qn90Var.a instanceof b8e0 : false) || w7c0Var.a(x9v0.a) == null || w7c0Var.a(kf90.a) == null) ? false : true, q160Var, jvc0VarA.a, list3, ((Boolean) w7c0Var.a(q2q0.a)).booleanValue() ? 2 : 1, z2);
            case 1:
                d4v d4vVar = (dpg1) obj;
                d4v d4vVar2 = d4vVar;
                if (!oap1.C((d4v) obj4).getDragAndDropManager().b.contains(d4vVar2) || !fn31.z(d4vVar2, jo31.j((x3v) obj5))) {
                    return cpg1.a;
                }
                ((p811) obj3).a = d4vVar;
                return cpg1.c;
            case 2:
                InAppMessage inAppMessage = (InAppMessage) obj;
                String strV = inAppMessage.v();
                long jS = inAppMessage.s();
                Long lValueOf = Long.valueOf(inAppMessage.r());
                MessageCreative messageCreative = (MessageCreative) ((xxi0) obj3).invoke(inAppMessage.p());
                Capping capping = (Capping) ((j141) obj4).invoke(inAppMessage.o());
                h290<Trigger> h290VarU = inAppMessage.u();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarU, 10));
                for (Trigger trigger : h290VarU) {
                    trigger.getClass();
                    arrayList.add((com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger) ((tae1) obj5).invoke(trigger));
                }
                String strName = inAppMessage.t().name();
                Enum r1 = MessageType.MARKETING;
                for (Enum r6 : MessageType.values()) {
                    if (u890.j(r6.name(), strName)) {
                        r4 = r6;
                        if (r4 == null) {
                            r16 = r1;
                        } else {
                            r16 = r4;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage(strV, jS, lValueOf, messageCreative, capping, arrayList, r16);
                    }
                }
                if (r4 == null) {
                    r16 = r1;
                } else {
                    r16 = r4;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage(strV, jS, lValueOf, messageCreative, capping, arrayList, r16);
            case 3:
                voe0 voe0Var = (voe0) obj3;
                fj10 fj10Var = voe0Var.b;
                bx81 bx81Var = voe0Var.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj4;
                Object objInvoke = concurrentHashMap.get(obj);
                Object obj6 = epo1.a;
                uoe0 uoe0Var = uoe0.b;
                if (objInvoke == null || objInvoke == uoe0Var) {
                    bx81Var.lock();
                    try {
                        Object obj7 = concurrentHashMap.get(obj);
                        uoe0 uoe0Var2 = uoe0.c;
                        if (obj7 == uoe0Var) {
                            lls0 lls0VarC = voe0Var.c(obj, "");
                            if (lls0VarC == null) {
                                a(3);
                                throw null;
                            }
                            if (lls0VarC.b) {
                                obj7 = uoe0Var2;
                            } else {
                                obj2 = lls0VarC.c;
                            }
                            bx81Var.unlock();
                            return obj2;
                        }
                        if (obj7 == uoe0Var2) {
                            lls0 lls0VarC2 = voe0Var.c(obj, "");
                            if (lls0VarC2 == null) {
                                a(3);
                                throw null;
                            }
                            if (!lls0VarC2.b) {
                                obj2 = lls0VarC2.c;
                            }
                            bx81Var.unlock();
                            return obj2;
                        }
                        if (obj7 != null) {
                            epo1.K(obj7);
                            if (obj7 != obj6) {
                                obj2 = obj7;
                            }
                            bx81Var.unlock();
                            return obj2;
                        }
                        try {
                            concurrentHashMap.put(obj, uoe0Var);
                            objInvoke = ((iu30) obj5).invoke(obj);
                            if (objInvoke != null) {
                                obj6 = objInvoke;
                            }
                            Object objPut = concurrentHashMap.put(obj, obj6);
                            if (objPut != uoe0Var) {
                                assertionErrorE = e(obj, objPut);
                                throw assertionErrorE;
                            }
                            bx81Var.unlock();
                        } catch (Throwable th) {
                            if (ggo1.I(th)) {
                                try {
                                    Object objRemove = concurrentHashMap.remove(obj);
                                    if (objRemove != uoe0Var) {
                                        throw d(obj, objRemove);
                                    }
                                    throw th;
                                } catch (Throwable th2) {
                                    throw f(obj, th2);
                                }
                            }
                            if (th != assertionErrorE) {
                                Object objPut2 = concurrentHashMap.put(obj, new lim1(th));
                                if (objPut2 != uoe0Var) {
                                    throw e(obj, objPut2);
                                }
                                fj10Var.getClass();
                                throw th;
                            }
                            try {
                                concurrentHashMap.remove(obj);
                                fj10Var.getClass();
                                throw th;
                            } catch (Throwable th3) {
                                throw f(obj, th3);
                            }
                        }
                        bx81Var.unlock();
                        throw th;
                    } catch (Throwable th4) {
                        bx81Var.unlock();
                        throw th4;
                    }
                }
                epo1.K(objInvoke);
                if (objInvoke == obj6) {
                    return null;
                }
                return objInvoke;
            case 4:
                return ((Single) ((x5u) obj4).invoke()).flatMapCompletable(new m021(this, (me20) obj, (byte) 16));
            case 5:
                pk61 pk61Var = (pk61) obj;
                iwu iwuVar = (iwu) obj5;
                return Single.zip(((Single) iwuVar.invoke(pk61Var.b.p())).flatMap(new ks21(this, (byte) 15)), ((Single) iwuVar.invoke(pk61Var.c.J())).flatMap(new ks21(this, (byte) 15)), m9x0.X).flatMapCompletable(new nt21(pk61Var, this, (byte) 25));
            case 6:
                h28 h28Var = (h28) obj5;
                long j = ((g0h0) obj).a;
                m441 m441Var = new m441(new xs50(this, j, (lnm) null));
                h28Var.getClass();
                return h4p1.g(new g28(m441Var, h28Var, j, (lnm) null, (byte) 0));
            default:
                s760 s760Var = (s760) obj5;
                x8c0 x8c0Var = (x8c0) obj4;
                bs50 bs50Var = (bs50) obj3;
                o6x o6xVar = o6x.a;
                if (bs50Var.J(o6xVar)) {
                    bs50Var.h(o6xVar, new sjj1(x8c0Var, s760Var, (byte) 5));
                } else {
                    x8c0Var.d(s760Var);
                }
                return rih1.a;
        }
    }

    public /* synthetic */ ffr(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
