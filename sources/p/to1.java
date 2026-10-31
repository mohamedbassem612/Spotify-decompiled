package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class to1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to1(Function0 function0, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return new to1(function0, lnmVar, (byte) 0);
            case 1:
                return new to1(function0, lnmVar, (byte) 1);
            case 2:
                return new to1(function0, lnmVar, (byte) 2);
            case 3:
                return new to1(function0, lnmVar, (byte) 3);
            case 4:
                return new to1(function0, lnmVar, (byte) 4);
            case 5:
                return new to1(function0, lnmVar, (byte) 5);
            case 6:
                return new to1(function0, lnmVar, (byte) 6);
            case 7:
                return new to1(function0, lnmVar, (byte) 7);
            case 8:
                return new to1(function0, lnmVar, (byte) 8);
            case 9:
                return new to1(function0, lnmVar, (byte) 9);
            case 10:
                return new to1(function0, lnmVar, (byte) 10);
            case 11:
                return new to1(function0, lnmVar, (byte) 11);
            case 12:
                return new to1(function0, lnmVar, (byte) 12);
            case 13:
                return new to1(function0, lnmVar, (byte) 13);
            case 14:
                return new to1(function0, lnmVar, (byte) 14);
            case 15:
                return new to1(function0, lnmVar, (byte) 15);
            case 16:
                return new to1(function0, lnmVar, (byte) 16);
            case 17:
                return new to1(function0, lnmVar, (byte) 17);
            case 18:
                return new to1(function0, lnmVar, (byte) 18);
            case 19:
                return new to1(function0, lnmVar, (byte) 19);
            default:
                return new to1(function0, lnmVar, (byte) 20);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function0 function0 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 6:
                String str = ((gq0) obj).a;
                new to1(function0, (lnm) obj2, (byte) 6).invokeSuspend(rih1Var);
                break;
            case 7:
                String str2 = ((gq0) obj).a;
                new to1(function0, (lnm) obj2, (byte) 7).invokeSuspend(rih1Var);
                break;
            case 8:
                String str3 = ((gq0) obj).a;
                new to1(function0, (lnm) obj2, (byte) 8).invokeSuspend(rih1Var);
                break;
            case 9:
                String str4 = ((gq0) obj).a;
                new to1(function0, (lnm) obj2, (byte) 9).invokeSuspend(rih1Var);
                break;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                String str5 = ((gq0) obj).a;
                new to1(function0, (lnm) obj2, (byte) 20).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                function0.invoke();
                break;
            case 1:
                hm5.M(obj);
                function0.invoke();
                break;
            case 2:
                hm5.M(obj);
                function0.invoke();
                break;
            case 3:
                hm5.M(obj);
                function0.invoke();
                break;
            case 4:
                hm5.M(obj);
                function0.invoke();
                break;
            case 5:
                hm5.M(obj);
                n57.s("ChatMembersPage: Current user not found in members or pending");
                function0.invoke();
                break;
            case 6:
                hm5.M(obj);
                function0.invoke();
                break;
            case 7:
                hm5.M(obj);
                function0.invoke();
                break;
            case 8:
                hm5.M(obj);
                function0.invoke();
                break;
            case 9:
                hm5.M(obj);
                function0.invoke();
                break;
            case 10:
                hm5.M(obj);
                function0.invoke();
                break;
            case 11:
                hm5.M(obj);
                function0.invoke();
                break;
            case 12:
                hm5.M(obj);
                function0.invoke();
                break;
            case 13:
                hm5.M(obj);
                function0.invoke();
                break;
            case 14:
                hm5.M(obj);
                function0.invoke();
                break;
            case 15:
                hm5.M(obj);
                function0.invoke();
                break;
            case 16:
                hm5.M(obj);
                function0.invoke();
                break;
            case 17:
                hm5.M(obj);
                function0.invoke();
                break;
            case 18:
                hm5.M(obj);
                function0.invoke();
                break;
            case 19:
                hm5.M(obj);
                function0.invoke();
                break;
            default:
                hm5.M(obj);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
