package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v4e0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4e0(yg8 yg8Var, vxf0 vxf0Var, boolean z, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.c = yg8Var;
        this.d = vxf0Var;
        this.b = z;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                v4e0 v4e0Var = new v4e0(obj3, obj2, lnmVar, (byte) 0);
                v4e0Var.c = obj;
                return v4e0Var;
            case 1:
                v4e0 v4e0Var2 = new v4e0(obj3, obj2, lnmVar, (byte) 1);
                v4e0Var2.c = obj;
                return v4e0Var2;
            case 2:
                v4e0 v4e0Var3 = new v4e0(obj3, obj2, lnmVar, (byte) 2);
                v4e0Var3.c = obj;
                return v4e0Var3;
            case 3:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                return new v4e0((yg8) this.c, (vxf0) obj3, this.b, (ven0) obj2, lnmVar);
            case 5:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                v4e0 v4e0Var4 = new v4e0(obj3, obj2, lnmVar, (byte) 6);
                v4e0Var4.c = obj;
                return v4e0Var4;
            case 7:
                v4e0 v4e0Var5 = new v4e0(obj3, obj2, lnmVar, (byte) 7);
                v4e0Var5.c = obj;
                return v4e0Var5;
            case 8:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 11);
            case 12:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 13);
            case 14:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 14);
            case 15:
                v4e0 v4e0Var6 = new v4e0(obj3, obj2, lnmVar, (byte) 15);
                v4e0Var6.c = obj;
                return v4e0Var6;
            case 16:
                v4e0 v4e0Var7 = new v4e0(obj3, obj2, lnmVar, (byte) 16);
                v4e0Var7.c = obj;
                return v4e0Var7;
            case 17:
                v4e0 v4e0Var8 = new v4e0(obj3, obj2, lnmVar, (byte) 17);
                v4e0Var8.c = obj;
                return v4e0Var8;
            case 18:
                v4e0 v4e0Var9 = new v4e0(obj3, obj2, lnmVar, (byte) 18);
                v4e0Var9.c = obj;
                return v4e0Var9;
            case 19:
                v4e0 v4e0Var10 = new v4e0(obj3, obj2, lnmVar, (byte) 19);
                v4e0Var10.c = obj;
                return v4e0Var10;
            case 20:
                v4e0 v4e0Var11 = new v4e0(obj3, lnmVar, obj2, (byte) 20);
                v4e0Var11.c = obj;
                return v4e0Var11;
            case 21:
                v4e0 v4e0Var12 = new v4e0(obj3, obj2, lnmVar, (byte) 21);
                v4e0Var12.c = obj;
                return v4e0Var12;
            case 22:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 22);
            case 23:
                v4e0 v4e0Var13 = new v4e0(obj3, obj2, lnmVar, (byte) 23);
                v4e0Var13.c = obj;
                return v4e0Var13;
            case 24:
                v4e0 v4e0Var14 = new v4e0(obj3, lnmVar, obj2, (byte) 24);
                v4e0Var14.c = obj;
                return v4e0Var14;
            case 25:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 25);
            case 26:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 26);
            case 27:
                v4e0 v4e0Var15 = new v4e0(obj3, obj2, lnmVar, (byte) 27);
                v4e0Var15.c = obj;
                return v4e0Var15;
            case 28:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 28);
            default:
                return new v4e0(this.c, obj3, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create(obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((ContextTrack) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0561  */
    /* JADX WARN: Code duplicated, block: B:229:0x056d  */
    /* JADX WARN: Code duplicated, block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x0552 -> B:225:0x0555). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:216:0x0537
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v4e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4e0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4e0(Object obj, lnm lnmVar, Object obj2, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4e0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
