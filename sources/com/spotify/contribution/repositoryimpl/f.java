package com.spotify.contribution.repositoryimpl;

import java.util.List;
import p.d9n;
import p.eg;
import p.gga;
import p.hm5;
import p.jqm;
import p.k4p1;
import p.kqh1;
import p.nvm;
import p.o7h;
import p.onm;
import p.qum;
import p.rrm;
import p.som;
import p.trm;
import p.urm;
import p.xum;
import p.zgo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f implements qum, jqm {
    public final a a;
    public final urm b;

    public f(a aVar, urm urmVar) {
        this.a = aVar;
        this.b = urmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.model.ContributionPartialCreateException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:47:0x010d->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r11 == r5) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r10, p.onm r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.contribution.repositoryimpl.f.a(java.util.List, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r6.b.b(r9, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, p.nvm r8, p.onm r9) throws com.spotify.contribution.repositoryimpl.ContributionApiError.EmptyResponse {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.wum
            if (r0 == 0) goto L13
            r0 = r9
            p.wum r0 = (p.wum) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.wum r0 = new p.wum
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L79
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.nvm r8 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r9)
            goto L54
        L39:
            p.hm5.M(r9)
            p.b7t r9 = new p.b7t
            r9.<init>(r7)
            java.util.List r9 = p.k4p1.x(r9)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            com.spotify.contribution.repositoryimpl.a r1 = r6.a
            java.io.Serializable r9 = r1.b(r9, r0)
            if (r9 != r5) goto L54
            goto L78
        L54:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = p.o7h.s0(r9)
            p.gga r9 = (p.gga) r9
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r9.a()
            p.hm5.M(r9)
            p.qrm r9 = new p.qrm
            r9.<init>(r8, r7)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            p.urm r6 = r6.b
            java.lang.Object r6 = r6.b(r9, r0)
            if (r6 != r5) goto L79
        L78:
            return r5
        L79:
            p.rih1 r6 = p.rih1.a
            return r6
        L7c:
            com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse r6 = com.spotify.contribution.repositoryimpl.ContributionApiError.EmptyResponse.a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.contribution.repositoryimpl.f.b(java.lang.String, p.nvm, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, nvm nvmVar, zgo1 zgo1Var, onm onmVar) throws ContributionApiError.EmptyResponse {
        xum xumVar;
        if (onmVar instanceof xum) {
            xumVar = (xum) onmVar;
            int i = xumVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xumVar.g = i - Integer.MIN_VALUE;
            } else {
                xumVar = new xum(this, onmVar);
            }
        } else {
            xumVar = new xum(this, onmVar);
        }
        Object objF = xumVar.e;
        int i2 = xumVar.g;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            List listX = k4p1.x(new kqh1(str, zgo1Var));
            xumVar.a = str;
            xumVar.b = nvmVar;
            xumVar.c = zgo1Var;
            xumVar.g = 1;
            objF = this.a.f(listX, xumVar);
            if (objF != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            som somVar = xumVar.d;
            hm5.M(objF);
            return somVar;
        }
        zgo1Var = xumVar.c;
        nvmVar = xumVar.b;
        str = xumVar.a;
        hm5.M(objF);
        gga ggaVar = (gga) o7h.s0((List) objF);
        if (ggaVar == null) {
            throw ContributionApiError.EmptyResponse.a;
        }
        Object objA = ggaVar.a();
        hm5.M(objA);
        som somVar2 = (som) objA;
        trm rrmVar = new rrm(nvmVar, str, zgo1Var);
        xumVar.a = null;
        xumVar.b = null;
        xumVar.c = null;
        xumVar.d = somVar2;
        xumVar.g = 2;
        return this.b.b(rrmVar, xumVar) == obj ? obj : somVar2;
    }
}
