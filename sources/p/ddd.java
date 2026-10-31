package p;

import android.os.Parcelable;
import com.spotify.campfire.datasource.impl.proto.AgentContext;
import com.spotify.campfire.datasource.impl.proto.Asset;
import com.spotify.campfire.datasource.impl.proto.ChatEventType;
import com.spotify.campfire.datasource.impl.proto.ClientEventCapture;
import com.spotify.campfire.datasource.impl.proto.ClientNode;
import com.spotify.campfire.datasource.impl.proto.ClientNodeResponse;
import com.spotify.campfire.datasource.impl.proto.ContributionClass;
import com.spotify.campfire.datasource.impl.proto.ContributionPayload;
import com.spotify.campfire.datasource.impl.proto.ErrorReason;
import com.spotify.campfire.datasource.impl.proto.Group;
import com.spotify.campfire.datasource.impl.proto.GroupMember;
import com.spotify.campfire.datasource.impl.proto.GroupMemberStatus;
import com.spotify.campfire.datasource.impl.proto.Hierarchy;
import com.spotify.campfire.datasource.impl.proto.HierarchyAgent;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailability;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessagingUnavailableReason;
import com.spotify.campfire.datasource.impl.proto.HierarchyMetadata;
import com.spotify.campfire.datasource.impl.proto.HierarchyType;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserRole;
import com.spotify.campfire.datasource.impl.proto.InviteToken;
import com.spotify.campfire.datasource.impl.proto.ListeningStatsInteraction;
import com.spotify.campfire.datasource.impl.proto.MessagePayload;
import com.spotify.campfire.datasource.impl.proto.ModerationStatus;
import com.spotify.campfire.datasource.impl.proto.Receipt;
import com.spotify.campfire.datasource.impl.proto.RetrieveNodeResponse;
import com.spotify.campfire.datasource.impl.proto.TrackedShare;
import com.spotify.campfire.datasource.impl.proto.UGC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ddd implements bdd {
    public final add a;
    public final sg31 b;

    public ddd(add addVar, sg31 sg31Var) {
        this.a = addVar;
        this.b = sg31Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static piz c(sy21 sy21Var) throws NoWhenBranchMatchedException {
        uz21 uz21Var = sy21Var.c;
        if (uz21Var != null) {
            ErrorReason from = ErrorReason.parseFrom(uz21Var.a());
            ErrorReason.ECase eCase = from.getECase();
            switch (eCase == null ? -1 : cdd.n[eCase.ordinal()]) {
                case 1:
                    return miz.a;
                case 2:
                    return new liz(from.getShouldAssureAge().getAgeThreshold());
                case 3:
                    return jiz.a;
                case 4:
                    return kiz.a;
                case 5:
                    return giz.a;
                case 6:
                    return niz.a;
                case 7:
                    return hiz.a;
                case 8:
                    return iiz.a;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:101:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x0207  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0222  */
    /* JADX WARN: Code duplicated, block: B:110:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x0228  */
    /* JADX WARN: Code duplicated, block: B:112:0x022b  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:116:0x023f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:119:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x0247  */
    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:122:0x024b  */
    /* JADX WARN: Code duplicated, block: B:125:0x026d  */
    /* JADX WARN: Code duplicated, block: B:127:0x027f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0281  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0297  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x02be  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02de  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa A[LOOP:1: B:85:0x01a4->B:87:0x01aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fe  */
    @Override // p.bdd
    public final goe b(Hierarchy hierarchy, List list, gxz0 gxz0Var) throws NoWhenBranchMatchedException {
        ctf btfVar;
        ctf ctfVar;
        String initiatorUsername;
        ArrayList arrayList;
        add addVar;
        goe goeVar;
        ArrayList arrayList2;
        HierarchyMetadata hierarchyMetadata;
        yks0 yks0Var;
        xks0 xks0Var;
        int i;
        c8j0 d8j0Var;
        HierarchyMessagingAvailability messagingAvailability;
        HierarchyMessagingAvailability.AvailabilityCase availabilityCase;
        int i2;
        HierarchyMessagingUnavailableReason reason;
        int i3;
        int i4;
        List agentsList;
        Iterator it;
        String invitedByUsername;
        String str;
        HierarchyUserRole userRole;
        int i5;
        awm awmVar;
        GroupMemberStatus groupMemberStatus;
        int i6;
        cwm cwmVar;
        w4i1 w4i1Var;
        HierarchyType hierarchyType = hierarchy.getHierarchyMetadata().getHierarchyType();
        Group group = hierarchy.getGroup();
        int i7 = cdd.b[hierarchyType.ordinal()];
        goe goeVar2 = null;
        if (i7 != 1) {
            if (i7 == 2) {
                String name = group.getName();
                name.getClass();
                if (ihc1.y0(name)) {
                    name = null;
                }
                List<InviteToken> inviteTokenList = group.getInviteTokenList();
                ArrayList arrayList3 = new ArrayList(q7h.U(inviteTokenList, 10));
                for (InviteToken inviteToken : inviteTokenList) {
                    inviteToken.getClass();
                    arrayList3.add(new oe90(inviteToken.getPermissionToken(), new w4i1(inviteToken.getCreatorUsername(), inviteToken.getCreatorUsername(), 12, (String) null)));
                }
                btfVar = new btf(name, arrayList3);
            } else {
                if (i7 != 3 && i7 != 4) {
                    eg.o();
                    return null;
                }
                ctfVar = null;
            }
            if (ctfVar != null) {
                return null;
            }
            String hierarchyId = hierarchy.getHierarchyIdentifier().getHierarchyId();
            jlh1 jlh1Var = new jlh1(hierarchy.getHierarchyStatistic().getTotalUserUnseenEvents(), hierarchy.getHierarchyStatistic().getTotalUserUnseenActivityEvents(), hierarchy.getHierarchyStatistic().getTotalUserUnseenContributionEvents());
            List groupMemberList = hierarchy.getGroup().getGroupMemberList();
            initiatorUsername = hierarchy.getHierarchyMetadata().getInitiatorUsername();
            List<GroupMember> list2 = groupMemberList;
            arrayList = new ArrayList(q7h.U(list2, 10));
            for (GroupMember groupMember : list2) {
                invitedByUsername = groupMember.getInvitedByUsername();
                invitedByUsername.getClass();
                if (ihc1.y0(invitedByUsername)) {
                    invitedByUsername = null;
                }
                if (invitedByUsername == null) {
                    str = invitedByUsername;
                } else if (initiatorUsername != null || initiatorUsername.length() <= 0) {
                    str = null;
                } else {
                    str = initiatorUsername;
                }
                if (u890.j(str, groupMember.getMemberUsername())) {
                    str = null;
                }
                w4i1 w4i1Var2 = new w4i1(groupMember.getMemberUsername(), groupMember.getMemberUsername(), 8, (String) null);
                userRole = groupMember.getUserRole();
                if (userRole == null) {
                    i5 = -1;
                } else {
                    i5 = cdd.h[userRole.ordinal()];
                }
                if (i5 == 1) {
                    awmVar = zvm.a;
                } else {
                    if (i5 == 2 && i5 != 3 && i5 != 4) {
                        eg.o();
                        return null;
                    }
                    awmVar = awm.a;
                }
                groupMemberStatus = groupMember.getGroupMemberStatus();
                if (groupMemberStatus == null) {
                    i6 = -1;
                } else {
                    i6 = cdd.i[groupMemberStatus.ordinal()];
                }
                if (i6 != 1) {
                    cwmVar = ewm.a;
                } else if (i6 != 2) {
                    cwmVar = fwm.a;
                } else if (i6 == 3) {
                    cwmVar = dwm.a;
                } else {
                    if (i6 == 4 && i6 != 5) {
                        eg.o();
                        return null;
                    }
                    cwmVar = cwm.a;
                }
                if (str != null) {
                    w4i1Var = new w4i1(str, str, 8, (String) null);
                } else {
                    w4i1Var = null;
                }
                arrayList.add(new jwm(w4i1Var2, awmVar, cwmVar, w4i1Var));
            }
            addVar = this.a;
            if (addVar.a()) {
                agentsList = hierarchy.getHierarchyMetadata().getAgentsList();
                if (agentsList.isEmpty()) {
                    agentsList = null;
                }
                if (agentsList != null) {
                    List list3 = agentsList;
                    arrayList2 = new ArrayList(q7h.U(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new jwm(14, new w4i1(((HierarchyAgent) it.next()).getAgentUri(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png")));
                        goeVar2 = goeVar2;
                    }
                    goeVar = goeVar2;
                } else {
                    goeVar = null;
                    arrayList2 = null;
                }
            } else {
                goeVar = null;
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList = o7h.N0(arrayList2, arrayList);
            }
            hierarchyMetadata = hierarchy.getHierarchyMetadata();
            String initiatorUsername2 = hierarchyMetadata.getInitiatorUsername();
            switch (cdd.g[hierarchyMetadata.getCurrentUserParticipationStatus().ordinal()]) {
                case 1:
                    yks0Var = yks0.b;
                    break;
                case 2:
                    yks0Var = yks0.c;
                    break;
                case 3:
                    yks0Var = yks0.d;
                    break;
                case 4:
                    yks0Var = yks0.e;
                    break;
                case 5:
                    yks0Var = yks0.f;
                    break;
                case 6:
                    yks0Var = yks0.g;
                    break;
                case 7:
                case 8:
                case 9:
                    yks0Var = yks0.a;
                    break;
                default:
                    eg.o();
                    return goeVar;
            }
            switch (cdd.f[hierarchyMetadata.getHierarchyStatus().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    xks0Var = xks0.a;
                    break;
                case 4:
                    xks0Var = xks0.g;
                    break;
                case 5:
                    xks0Var = xks0.b;
                    break;
                case 6:
                    xks0Var = xks0.c;
                    break;
                case 7:
                    xks0Var = xks0.d;
                    break;
                case 8:
                    xks0Var = xks0.e;
                    break;
                case 9:
                    xks0Var = xks0.f;
                    break;
                default:
                    eg.o();
                    return goeVar;
            }
            switch (cdd.c[hierarchyMetadata.getSource().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    i = 1;
                    break;
                case 4:
                    i = 2;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                    i = 4;
                    break;
                case 7:
                    i = 5;
                    break;
                default:
                    eg.o();
                    return goeVar;
            }
            zks0 zks0Var = new zks0(i, xks0Var, initiatorUsername2, yks0Var);
            long jQ = hierarchy.getHierarchyMetadata().getCreatedAt().q();
            boolean currentUserChannelMuted = hierarchy.getHierarchyMetadata().getCurrentUserChannelMuted();
            if (addVar.a.K()) {
                messagingAvailability = hierarchy.getHierarchyMetadata().getCurrentUserState().getMessagingAvailability();
                availabilityCase = messagingAvailability.getAvailabilityCase();
                if (availabilityCase == null) {
                    i2 = -1;
                } else {
                    i2 = cdd.e[availabilityCase.ordinal()];
                }
                if (i2 == 1) {
                    reason = messagingAvailability.getDisallowed().getReason();
                    if (reason == null) {
                        i3 = -1;
                    } else {
                        i3 = cdd.d[reason.ordinal()];
                    }
                    switch (i3) {
                        case 1:
                            i4 = 2;
                            break;
                        case 2:
                            i4 = 3;
                            break;
                        case 3:
                            i4 = 4;
                            break;
                        case 4:
                            i4 = 5;
                            break;
                        case 5:
                            i4 = 6;
                            break;
                        case 6:
                            i4 = 7;
                            break;
                        case 7:
                            i4 = 8;
                            break;
                        case 8:
                        case 9:
                            i4 = 1;
                            break;
                        default:
                            eg.o();
                            return goeVar;
                    }
                    d8j0Var = new d8j0(i4);
                } else {
                    if (i2 == 2 && i2 != 3) {
                        eg.o();
                        return goeVar;
                    }
                    d8j0Var = c8j0.a;
                }
            } else {
                d8j0Var = e8j0.a;
            }
            return new goe(hierarchyId, ctfVar, zks0Var, gxz0Var, arrayList, list, jlh1Var, jQ, currentUserChannelMuted, d8j0Var, 320);
        }
        btfVar = atf.a;
        ctfVar = btfVar;
        if (ctfVar != null) {
            return null;
        }
        String hierarchyId2 = hierarchy.getHierarchyIdentifier().getHierarchyId();
        jlh1 jlh1Var2 = new jlh1(hierarchy.getHierarchyStatistic().getTotalUserUnseenEvents(), hierarchy.getHierarchyStatistic().getTotalUserUnseenActivityEvents(), hierarchy.getHierarchyStatistic().getTotalUserUnseenContributionEvents());
        List groupMemberList2 = hierarchy.getGroup().getGroupMemberList();
        initiatorUsername = hierarchy.getHierarchyMetadata().getInitiatorUsername();
        List<GroupMember> list4 = groupMemberList2;
        arrayList = new ArrayList(q7h.U(list4, 10));
        while (r0.hasNext()) {
            invitedByUsername = groupMember.getInvitedByUsername();
            invitedByUsername.getClass();
            if (ihc1.y0(invitedByUsername)) {
                invitedByUsername = null;
            }
            if (invitedByUsername == null) {
                str = invitedByUsername;
            } else if (initiatorUsername != null) {
                str = null;
            } else {
                str = null;
            }
            if (u890.j(str, groupMember.getMemberUsername())) {
                str = null;
            }
            w4i1 w4i1Var3 = new w4i1(groupMember.getMemberUsername(), groupMember.getMemberUsername(), 8, (String) null);
            userRole = groupMember.getUserRole();
            if (userRole == null) {
                i5 = -1;
            } else {
                i5 = cdd.h[userRole.ordinal()];
            }
            if (i5 == 1) {
                if (i5 == 2) {
                }
                awmVar = awm.a;
            } else {
                awmVar = zvm.a;
            }
            groupMemberStatus = groupMember.getGroupMemberStatus();
            if (groupMemberStatus == null) {
                i6 = -1;
            } else {
                i6 = cdd.i[groupMemberStatus.ordinal()];
            }
            if (i6 != 1) {
                cwmVar = ewm.a;
            } else if (i6 != 2) {
                cwmVar = fwm.a;
            } else if (i6 == 3) {
                if (i6 == 4) {
                }
                cwmVar = cwm.a;
            } else {
                cwmVar = dwm.a;
            }
            if (str != null) {
                w4i1Var = new w4i1(str, str, 8, (String) null);
            } else {
                w4i1Var = null;
            }
            arrayList.add(new jwm(w4i1Var3, awmVar, cwmVar, w4i1Var));
        }
        addVar = this.a;
        if (addVar.a()) {
            agentsList = hierarchy.getHierarchyMetadata().getAgentsList();
            if (agentsList.isEmpty()) {
                agentsList = null;
            }
            if (agentsList != null) {
                List list5 = agentsList;
                arrayList2 = new ArrayList(q7h.U(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new jwm(14, new w4i1(((HierarchyAgent) it.next()).getAgentUri(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png")));
                    goeVar2 = goeVar2;
                }
                goeVar = goeVar2;
            } else {
                goeVar = null;
                arrayList2 = null;
            }
        } else {
            goeVar = null;
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            arrayList = o7h.N0(arrayList2, arrayList);
        }
        hierarchyMetadata = hierarchy.getHierarchyMetadata();
        String initiatorUsername3 = hierarchyMetadata.getInitiatorUsername();
        switch (cdd.g[hierarchyMetadata.getCurrentUserParticipationStatus().ordinal()]) {
            case 1:
                yks0Var = yks0.b;
                break;
            case 2:
                yks0Var = yks0.c;
                break;
            case 3:
                yks0Var = yks0.d;
                break;
            case 4:
                yks0Var = yks0.e;
                break;
            case 5:
                yks0Var = yks0.f;
                break;
            case 6:
                yks0Var = yks0.g;
                break;
            case 7:
            case 8:
            case 9:
                yks0Var = yks0.a;
                break;
            default:
                eg.o();
                return goeVar;
        }
        switch (cdd.f[hierarchyMetadata.getHierarchyStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
                xks0Var = xks0.a;
                break;
            case 4:
                xks0Var = xks0.g;
                break;
            case 5:
                xks0Var = xks0.b;
                break;
            case 6:
                xks0Var = xks0.c;
                break;
            case 7:
                xks0Var = xks0.d;
                break;
            case 8:
                xks0Var = xks0.e;
                break;
            case 9:
                xks0Var = xks0.f;
                break;
            default:
                eg.o();
                return goeVar;
        }
        switch (cdd.c[hierarchyMetadata.getSource().ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = 1;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 3;
                break;
            case 6:
                i = 4;
                break;
            case 7:
                i = 5;
                break;
            default:
                eg.o();
                return goeVar;
        }
        zks0 zks0Var2 = new zks0(i, xks0Var, initiatorUsername3, yks0Var);
        long jQ2 = hierarchy.getHierarchyMetadata().getCreatedAt().q();
        boolean currentUserChannelMuted2 = hierarchy.getHierarchyMetadata().getCurrentUserChannelMuted();
        if (addVar.a.K()) {
            messagingAvailability = hierarchy.getHierarchyMetadata().getCurrentUserState().getMessagingAvailability();
            availabilityCase = messagingAvailability.getAvailabilityCase();
            if (availabilityCase == null) {
                i2 = -1;
            } else {
                i2 = cdd.e[availabilityCase.ordinal()];
            }
            if (i2 == 1) {
                if (i2 == 2) {
                }
                d8j0Var = c8j0.a;
            } else {
                reason = messagingAvailability.getDisallowed().getReason();
                if (reason == null) {
                    i3 = -1;
                } else {
                    i3 = cdd.d[reason.ordinal()];
                }
                switch (i3) {
                    case 1:
                        i4 = 2;
                        break;
                    case 2:
                        i4 = 3;
                        break;
                    case 3:
                        i4 = 4;
                        break;
                    case 4:
                        i4 = 5;
                        break;
                    case 5:
                        i4 = 6;
                        break;
                    case 6:
                        i4 = 7;
                        break;
                    case 7:
                        i4 = 8;
                        break;
                    case 8:
                    case 9:
                        i4 = 1;
                        break;
                    default:
                        eg.o();
                        return goeVar;
                }
                d8j0Var = new d8j0(i4);
            }
        } else {
            d8j0Var = e8j0.a;
        }
        return new goe(hierarchyId2, ctfVar, zks0Var2, gxz0Var, arrayList, list, jlh1Var2, jQ2, currentUserChannelMuted2, d8j0Var, 320);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final goe d(ClientNodeResponse clientNodeResponse) throws NoWhenBranchMatchedException {
        List clientNodeList = clientNodeResponse.getClientNodeList();
        int i = 0;
        if (!(clientNodeList instanceof Collection) || !clientNodeList.isEmpty()) {
            Iterator it = clientNodeList.iterator();
            while (it.hasNext()) {
                if (((ClientNode) it.next()).getMessagePayload().getCmpCase() == MessagePayload.CmpCase.CONTRIBUTION_PAYLOAD && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        int i2 = i;
        Hierarchy hierarchy = clientNodeResponse.getHierarchy();
        List<ClientNode> clientNodeList2 = clientNodeResponse.getClientNodeList();
        ArrayList arrayList = new ArrayList();
        for (ClientNode clientNode : clientNodeList2) {
            clientNode.getClass();
            tom tomVarF = f(clientNode, clientNodeResponse.getHierarchy().getHierarchyIdentifier().getHierarchyId());
            if (tomVarF != null) {
                arrayList.add(tomVarF);
            }
        }
        goe goeVarA = bdd.a(this, hierarchy, arrayList, null, 2);
        if (goeVarA != null) {
            return goe.a(goeVarA, (String) null, (btf) null, (gxz0) null, (ArrayList) null, (List) null, i2, 4031);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final goe e(RetrieveNodeResponse retrieveNodeResponse) throws NoWhenBranchMatchedException {
        List clientNodeList = retrieveNodeResponse.getClientNodeList();
        int i = 0;
        if (!(clientNodeList instanceof Collection) || !clientNodeList.isEmpty()) {
            Iterator it = clientNodeList.iterator();
            while (it.hasNext()) {
                if (((ClientNode) it.next()).getMessagePayload().getCmpCase() == MessagePayload.CmpCase.CONTRIBUTION_PAYLOAD && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        int i2 = i;
        Hierarchy hierarchy = retrieveNodeResponse.getHierarchy();
        List<ClientNode> clientNodeList2 = retrieveNodeResponse.getClientNodeList();
        ArrayList arrayList = new ArrayList();
        for (ClientNode clientNode : clientNodeList2) {
            clientNode.getClass();
            tom tomVarF = f(clientNode, retrieveNodeResponse.getHierarchy().getHierarchyIdentifier().getHierarchyId());
            if (tomVarF != null) {
                arrayList.add(tomVarF);
            }
        }
        goe goeVarA = bdd.a(this, hierarchy, arrayList, null, 2);
        if (goeVarA != null) {
            return goe.a(goeVarA, (String) null, (btf) null, (gxz0) null, (ArrayList) null, (List) null, i2, 4031);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:113:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0443  */
    /* JADX WARN: Code duplicated, block: B:135:0x0457  */
    /* JADX WARN: Code duplicated, block: B:143:0x0479  */
    /* JADX WARN: Code duplicated, block: B:146:0x049a  */
    /* JADX WARN: Code duplicated, block: B:148:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:151:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:158:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:160:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x0516  */
    /* JADX WARN: Code duplicated, block: B:167:0x0539 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x053b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x053d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0540  */
    /* JADX WARN: Code duplicated, block: B:177:0x054b  */
    /* JADX WARN: Code duplicated, block: B:178:0x054e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0551  */
    /* JADX WARN: Code duplicated, block: B:182:0x0559  */
    /* JADX WARN: Code duplicated, block: B:184:0x0562  */
    /* JADX WARN: Code duplicated, block: B:185:0x057d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0586  */
    /* JADX WARN: Code duplicated, block: B:191:0x059f  */
    /* JADX WARN: Code duplicated, block: B:193:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:195:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:197:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:199:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:201:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:203:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:206:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:207:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:208:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:209:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x05de  */
    /* JADX WARN: Code duplicated, block: B:216:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0589 A[SYNTHETIC] */
    public final tom f(ClientNode clientNode, String str) throws NoWhenBranchMatchedException {
        npl volVar;
        bpl bplVar;
        npl lplVar;
        bpl fplVar;
        dpl cplVar;
        kol oolVar;
        npl uolVar;
        String id;
        xo2 xo2Var;
        ClientEventCapture eventCapture;
        String initUsername;
        w4i1 w4i1VarU;
        ArrayList arrayList;
        sl01 sl01Var;
        ArrayList arrayList2;
        Iterator it;
        ModerationStatus moderationStatus;
        hom momVar;
        ModerationStatus.StatusCase statusCase;
        int i;
        ClientNode clientNode2;
        int i2;
        sl01 sl01Var2;
        String initiatorUsername;
        char c;
        pj01 pj01Var;
        gxz0 gxz0VarG;
        AgentContext agentContext;
        MessagePayload.CmpCase cmpCase = clientNode.getMessagePayload().getCmpCase();
        int i3 = cmpCase == null ? -1 : cdd.a[cmpCase.ordinal()];
        int i4 = 1;
        sl01 sl01Var3 = null;
        if (i3 != 1) {
            int i5 = 3;
            int i6 = 2;
            if (i3 == 2) {
                if (ihc1.y0(clientNode.getNodeIdentifier().getNodePathId())) {
                    n57.s("ClientNode with blank nodePathId in chat ".concat(str));
                    return null;
                }
                ContributionPayload contributionPayload = clientNode.getMessagePayload().getContributionPayload();
                ContributionClass contributionClass = clientNode.getNodeIdentifier().getNodeClass().getContributionClass();
                long jQ = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                ContributionPayload.CcpCase ccpCase = contributionPayload.getCcpCase();
                switch (ccpCase == null ? -1 : cdd.k[ccpCase.ordinal()]) {
                    case 1:
                        volVar = new vol(contributionPayload.getFreeText().getMessageText(), (!contributionPayload.hasMetadata() || contributionPayload.getMetadata().getMessageEnvelope().length() <= 0) ? null : contributionPayload.getMetadata().getMessageEnvelope());
                        if (volVar != null) {
                            ClientEventCapture eventCapture2 = clientNode.getEventCapture();
                            String initUsername2 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a() || (agentContext = eventCapture2.getAgentContext()) == null) {
                                xo2Var = null;
                            } else {
                                if (ihc1.y0(agentContext.getAgentId())) {
                                    agentContext = null;
                                }
                                if (agentContext != null) {
                                    xo2Var = new xo2(agentContext.getAgentId(), agentContext.getRole(), initUsername2);
                                } else {
                                    xo2Var = null;
                                }
                            }
                            String nodePathId = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ2 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var = w4i1VarU;
                            boolean userSeen = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            for (ClientNode clientNode3 : childNodeList) {
                                sl01 sl01Var4 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var4;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList2 = clientNode.getChildNodeList();
                            xo2 xo2Var2 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList2.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    sl01Var2 = sl01.c;
                                } else {
                                    if (i2 == 4 && i2 != 5) {
                                        eg.o();
                                        return sl01Var;
                                    }
                                    sl01Var2 = sl01Var;
                                }
                                initiatorUsername = receipt.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                            }
                            npl nplVar = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId, str, w4i1Var, jQ2, userSeen, nplVar, (rom) null, arrayList, arrayList2, momVar, false, xo2Var2, 1088);
                        }
                        break;
                    case 2:
                        String messageEnvelope = (!contributionPayload.hasMetadata() || contributionPayload.getMetadata().getMessageEnvelope().length() <= 0) ? null : contributionPayload.getMetadata().getMessageEnvelope();
                        String uri = contributionPayload.getTrackedShare().getUri();
                        TrackedShare trackedShare = contributionPayload.getTrackedShare();
                        if (trackedShare != null) {
                            if (trackedShare.getContext().hasListeningActivity()) {
                                fplVar = new bpl(trackedShare.getContext().getListeningActivity().getReaction(), trackedShare.getContext().getListeningActivity().getListeningUsername());
                            } else if (trackedShare.getContext().hasPlaylistReaction()) {
                                fplVar = new hpl(trackedShare.getContext().getPlaylistReaction().getReaction(), trackedShare.getContext().getPlaylistReaction().getPlaylistUri(), f46.r0(trackedShare.getContext().getPlaylistReaction().getItemId().t(), xj.Q0, 30));
                            } else if (trackedShare.getContext().hasPlaylistReply()) {
                                fplVar = new jpl(trackedShare.getContext().getPlaylistReply().getPlaylistUri(), f46.r0(trackedShare.getContext().getPlaylistReply().getItemId().t(), jpc.Z0, 30));
                            } else if (trackedShare.getContext().hasPlaylistMessage()) {
                                fplVar = new ipl(trackedShare.getContext().getPlaylistMessage().getPlaylistUri());
                            } else if (trackedShare.getContext().hasPlaylistInvitation()) {
                                fplVar = new gpl(trackedShare.getContext().getPlaylistInvitation().getPlaylistInvitationUri());
                            } else if (trackedShare.getContext().hasListeningStatsInteraction()) {
                                ListeningStatsInteraction listeningStatsInteraction = trackedShare.getContext().getListeningStatsInteraction();
                                if (listeningStatsInteraction.hasTopTrack()) {
                                    cplVar = new dpl(listeningStatsInteraction.getTopTrack().getEntityUri());
                                } else if (listeningStatsInteraction.hasTopArtist()) {
                                    cplVar = new cpl(listeningStatsInteraction.getTopArtist().getEntityUri());
                                } else {
                                    fplVar = null;
                                }
                                fplVar = new fpl(listeningStatsInteraction.getReaction(), listeningStatsInteraction.getTimeRange().p().q(), listeningStatsInteraction.getTimeRange().o().q(), cplVar);
                            } else {
                                fplVar = null;
                            }
                            bplVar = fplVar;
                        } else {
                            bplVar = null;
                        }
                        String previewId = contributionPayload.getTrackedShare().getPreviewId();
                        previewId.getClass();
                        String str2 = previewId.length() > 0 ? previewId : null;
                        String shareCardConfigId = contributionPayload.getTrackedShare().getShareCardConfigId();
                        shareCardConfigId.getClass();
                        lplVar = new lpl(uri, (bc71) null, str2, bplVar, (hmp0) null, messageEnvelope, shareCardConfigId.length() > 0 ? shareCardConfigId : null, 18);
                        volVar = lplVar;
                        if (volVar != null) {
                            ClientEventCapture eventCapture3 = clientNode.getEventCapture();
                            String initUsername3 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId2 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ3 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator2 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var2 = w4i1VarU;
                            boolean userSeen2 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList3 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var5 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var5;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList4 = clientNode.getChildNodeList();
                            xo2 xo2Var3 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList4.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt2 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt2.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt2.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar2 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId2, str, w4i1Var2, jQ3, userSeen2, nplVar2, (rom) null, arrayList, arrayList2, momVar, false, xo2Var3, 1088);
                        }
                        break;
                    case 3:
                        volVar = new lpl(ltn1.u(contributionPayload.getOpTrackedShare().getUri(), contributionPayload.getOpTrackedShare().getOpShareId()), (bc71) null, (String) null, (kpl) null, new hmp0(8, contributionPayload.getOpTrackedShare().getDestination(), contributionPayload.getOpTrackedShare().getOpShareId(), contributionClass == ContributionClass.CONTRIBUTION_CLASS_PRE_OP_SHARE, false), (String) null, (String) null, 110);
                        if (volVar != null) {
                            ClientEventCapture eventCapture4 = clientNode.getEventCapture();
                            String initUsername4 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId3 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ4 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator3 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var3 = w4i1VarU;
                            boolean userSeen3 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList5 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var6 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var6;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList6 = clientNode.getChildNodeList();
                            xo2 xo2Var4 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList6.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt3 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt3.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt3.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar3 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId3, str, w4i1Var3, jQ4, userSeen3, nplVar3, (rom) null, arrayList, arrayList2, momVar, false, xo2Var4, 1088);
                        }
                        break;
                    case 4:
                        String uri2 = contributionPayload.getChatInvite().getUri();
                        String destination = contributionPayload.getChatInvite().getDestination();
                        String shareId = contributionPayload.getChatInvite().getShareId();
                        Set set = s4b1.f;
                        lplVar = new lpl(uri2, (bc71) null, (String) null, (kpl) null, new hmp0(4, destination, shareId, false, pcf.o(uic.x(contributionPayload.getChatInvite().getUri()))), (String) null, (String) null, 110);
                        volVar = lplVar;
                        if (volVar != null) {
                            ClientEventCapture eventCapture5 = clientNode.getEventCapture();
                            String initUsername5 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId4 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ5 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator4 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var4 = w4i1VarU;
                            boolean userSeen4 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList7 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var7 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var7;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList8 = clientNode.getChildNodeList();
                            xo2 xo2Var5 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList8.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt4 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt4.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt4.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar4 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId4, str, w4i1Var4, jQ5, userSeen4, nplVar4, (rom) null, arrayList, arrayList2, momVar, false, xo2Var5, 1088);
                        }
                        break;
                    case 5:
                        ChatEventType.CetCase cetCase = contributionPayload.getChatEvent().getEventType().getCetCase();
                        switch (cetCase == null ? -1 : cdd.l[cetCase.ordinal()]) {
                            case 1:
                                oolVar = iol.a;
                                break;
                            case 2:
                                String invitedUsername = contributionPayload.getChatEvent().getEventType().getUserInvite().getInvitedUsername();
                                invitedUsername.getClass();
                                oolVar = new ool(new w4i1(invitedUsername, invitedUsername, 12, (String) null));
                                break;
                            case 3:
                                String removedUsername = contributionPayload.getChatEvent().getEventType().getRemoveUser().getRemovedUsername();
                                removedUsername.getClass();
                                oolVar = new sol(new w4i1(removedUsername, removedUsername, 12, (String) null));
                                break;
                            case 4:
                                oolVar = qol.a;
                                break;
                            case 5:
                                oolVar = rol.a;
                                break;
                            case 6:
                                oolVar = jol.a;
                                break;
                            case 7:
                                oolVar = mol.a;
                                break;
                            case 8:
                                oolVar = nol.a;
                                break;
                            case 9:
                                oolVar = lol.a;
                                break;
                            case 10:
                                oolVar = null;
                                break;
                            case 11:
                                oolVar = new kol(jQ);
                                break;
                            default:
                                eg.o();
                                return null;
                        }
                        if (oolVar != null) {
                            uolVar = new uol(oolVar);
                            volVar = uolVar;
                        } else {
                            volVar = null;
                        }
                        if (volVar != null) {
                            ClientEventCapture eventCapture6 = clientNode.getEventCapture();
                            String initUsername6 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId5 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ6 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator5 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var5 = w4i1VarU;
                            boolean userSeen5 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList9 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var8 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var8;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList10 = clientNode.getChildNodeList();
                            xo2 xo2Var6 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList10.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt5 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt5.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt5.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar5 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId5, str, w4i1Var5, jQ6, userSeen5, nplVar5, (rom) null, arrayList, arrayList2, momVar, false, xo2Var6, 1088);
                        }
                        break;
                    case 6:
                        if (contributionPayload.getRichMedia().hasGiphyGif()) {
                            uolVar = new wol(contributionPayload.getRichMedia().getGiphyGif().getGifId(), (lg31) null, 6);
                        } else if (contributionPayload.getRichMedia().hasSticker()) {
                            uolVar = new mpl(contributionPayload.getRichMedia().getSticker().getStickerId());
                        } else {
                            if (contributionPayload.getRichMedia().hasUgc() && this.b.a.a.Y()) {
                                UGC ugc = contributionPayload.getRichMedia().getUgc();
                                List imageList = ugc.getImageList();
                                ArrayList arrayList3 = new ArrayList(q7h.U(imageList, 10));
                                Iterator it2 = imageList.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(new opl(((Asset) it2.next()).getAssetRef(), 1));
                                }
                                List videoList = ugc.getVideoList();
                                ArrayList arrayList4 = new ArrayList(q7h.U(videoList, 10));
                                Iterator it3 = videoList.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new opl(((Asset) it3.next()).getAssetRef(), 2));
                                }
                                ArrayList arrayListN0 = o7h.N0(arrayList4, arrayList3);
                                opl oplVar = (opl) o7h.s0(arrayListN0);
                                if (oplVar == null || (id = oplVar.getId()) == null) {
                                    id = "";
                                }
                                uolVar = new ppl(id, arrayListN0);
                            } else {
                                volVar = null;
                            }
                            if (volVar != null) {
                                ClientEventCapture eventCapture7 = clientNode.getEventCapture();
                                String initUsername7 = clientNode.getEventCapture().getInitUsername();
                                if (this.a.a()) {
                                    xo2Var = null;
                                } else {
                                    xo2Var = null;
                                }
                                String nodePathId6 = clientNode.getNodeIdentifier().getNodePathId();
                                long jQ7 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                                eventCapture = clientNode.getEventCapture();
                                if (xo2Var != null) {
                                    w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                                } else {
                                    initUsername = eventCapture.getInitUsername();
                                    initUsername.getClass();
                                    if (ihc1.y0(initUsername)) {
                                        initUsername = null;
                                    }
                                    if (initUsername != null) {
                                        w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                    } else {
                                        Parcelable.Creator creator6 = w4i1.CREATOR;
                                        w4i1VarU = loo1.u();
                                    }
                                }
                                w4i1 w4i1Var6 = w4i1VarU;
                                boolean userSeen6 = clientNode.getNodeStatistic().getUserSeen();
                                List<ClientNode> childNodeList11 = clientNode.getChildNodeList();
                                arrayList = new ArrayList();
                                while (r13.hasNext()) {
                                    sl01 sl01Var9 = sl01Var3;
                                    clientNode3.getClass();
                                    gxz0VarG = g(clientNode3);
                                    if (gxz0VarG != null) {
                                        arrayList.add(gxz0VarG);
                                    }
                                    sl01Var3 = sl01Var9;
                                }
                                sl01Var = sl01Var3;
                                List childNodeList12 = clientNode.getChildNodeList();
                                xo2 xo2Var7 = xo2Var;
                                arrayList2 = new ArrayList();
                                it = childNodeList12.iterator();
                                while (it.hasNext()) {
                                    clientNode2 = (ClientNode) it.next();
                                    clientNode2.getClass();
                                    Receipt receipt6 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                    i2 = cdd.m[receipt6.getReceiptType().ordinal()];
                                    if (i2 == i4) {
                                        sl01Var2 = sl01.a;
                                    } else if (i2 == i6) {
                                        sl01Var2 = sl01.b;
                                    } else if (i2 == i5) {
                                        if (i2 == 4) {
                                        }
                                        sl01Var2 = sl01Var;
                                    } else {
                                        sl01Var2 = sl01.c;
                                    }
                                    initiatorUsername = receipt6.getInitiatorUsername();
                                    if (sl01Var2 != null) {
                                        initiatorUsername.getClass();
                                        if (initiatorUsername.length() > 0) {
                                            c = '\b';
                                            pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                        } else {
                                            c = '\b';
                                            pj01Var = null;
                                        }
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                    if (pj01Var != null) {
                                        arrayList2.add(pj01Var);
                                    }
                                    volVar = volVar;
                                    it = it;
                                    i4 = 1;
                                    i5 = 3;
                                    i6 = 2;
                                    sl01Var = null;
                                    break;
                                }
                                npl nplVar6 = volVar;
                                moderationStatus = clientNode.getModerationStatus();
                                momVar = kom.a;
                                if (moderationStatus != null) {
                                    statusCase = moderationStatus.getStatusCase();
                                    if (statusCase == null) {
                                        i = -1;
                                    } else {
                                        i = cdd.j[statusCase.ordinal()];
                                    }
                                    if (i == 1) {
                                        momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                    } else if (i == 2) {
                                        momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                    } else if (i == 3) {
                                        momVar = new jom();
                                    } else if (i == 4) {
                                        momVar = iom.a;
                                    } else if (i == 5) {
                                        momVar = hom.a;
                                    }
                                }
                                return new tom(nodePathId6, str, w4i1Var6, jQ7, userSeen6, nplVar6, (rom) null, arrayList, arrayList2, momVar, false, xo2Var7, 1088);
                            }
                        }
                        volVar = uolVar;
                        if (volVar != null) {
                            ClientEventCapture eventCapture8 = clientNode.getEventCapture();
                            String initUsername8 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId7 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ8 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator7 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var7 = w4i1VarU;
                            boolean userSeen7 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList13 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var10 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var10;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList14 = clientNode.getChildNodeList();
                            xo2 xo2Var8 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList14.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt7 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt7.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt7.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar7 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId7, str, w4i1Var7, jQ8, userSeen7, nplVar7, (rom) null, arrayList, arrayList2, momVar, false, xo2Var8, 1088);
                        }
                        break;
                    case 7:
                        volVar = new npl(pcf.d(6, str, (String) null), (String) null, (Integer) null, (String) null);
                        if (volVar != null) {
                            ClientEventCapture eventCapture9 = clientNode.getEventCapture();
                            String initUsername9 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId8 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ9 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator8 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var8 = w4i1VarU;
                            boolean userSeen8 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList15 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var11 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var11;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList16 = clientNode.getChildNodeList();
                            xo2 xo2Var9 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList16.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt8 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt8.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt8.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar8 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId8, str, w4i1Var8, jQ9, userSeen8, nplVar8, (rom) null, arrayList, arrayList2, momVar, false, xo2Var9, 1088);
                        }
                        break;
                    case 8:
                        volVar = null;
                        if (volVar != null) {
                            ClientEventCapture eventCapture10 = clientNode.getEventCapture();
                            String initUsername10 = clientNode.getEventCapture().getInitUsername();
                            if (this.a.a()) {
                                xo2Var = null;
                            } else {
                                xo2Var = null;
                            }
                            String nodePathId9 = clientNode.getNodeIdentifier().getNodePathId();
                            long jQ10 = clientNode.getEventCapture().getEventCapture().getOccurredAt().q();
                            eventCapture = clientNode.getEventCapture();
                            if (xo2Var != null) {
                                w4i1VarU = new w4i1(xo2Var.a(), "Studio by Spotify Labs", 8, "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png");
                            } else {
                                initUsername = eventCapture.getInitUsername();
                                initUsername.getClass();
                                if (ihc1.y0(initUsername)) {
                                    initUsername = null;
                                }
                                if (initUsername != null) {
                                    w4i1VarU = new w4i1(initUsername, initUsername, 12, (String) null);
                                } else {
                                    Parcelable.Creator creator9 = w4i1.CREATOR;
                                    w4i1VarU = loo1.u();
                                }
                            }
                            w4i1 w4i1Var9 = w4i1VarU;
                            boolean userSeen9 = clientNode.getNodeStatistic().getUserSeen();
                            List<ClientNode> childNodeList17 = clientNode.getChildNodeList();
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                sl01 sl01Var12 = sl01Var3;
                                clientNode3.getClass();
                                gxz0VarG = g(clientNode3);
                                if (gxz0VarG != null) {
                                    arrayList.add(gxz0VarG);
                                }
                                sl01Var3 = sl01Var12;
                            }
                            sl01Var = sl01Var3;
                            List childNodeList18 = clientNode.getChildNodeList();
                            xo2 xo2Var10 = xo2Var;
                            arrayList2 = new ArrayList();
                            it = childNodeList18.iterator();
                            while (it.hasNext()) {
                                clientNode2 = (ClientNode) it.next();
                                clientNode2.getClass();
                                Receipt receipt9 = clientNode2.getMessagePayload().getActivityPayload().getReceipt();
                                i2 = cdd.m[receipt9.getReceiptType().ordinal()];
                                if (i2 == i4) {
                                    sl01Var2 = sl01.a;
                                } else if (i2 == i6) {
                                    sl01Var2 = sl01.b;
                                } else if (i2 == i5) {
                                    if (i2 == 4) {
                                    }
                                    sl01Var2 = sl01Var;
                                } else {
                                    sl01Var2 = sl01.c;
                                }
                                initiatorUsername = receipt9.getInitiatorUsername();
                                if (sl01Var2 != null) {
                                    initiatorUsername.getClass();
                                    if (initiatorUsername.length() > 0) {
                                        c = '\b';
                                        pj01Var = new pj01(clientNode2.getNodeIdentifier().getNodePathId(), sl01Var2, new w4i1(initiatorUsername, initiatorUsername, 8, sl01Var));
                                    } else {
                                        c = '\b';
                                        pj01Var = null;
                                    }
                                } else {
                                    c = '\b';
                                    pj01Var = null;
                                }
                                if (pj01Var != null) {
                                    arrayList2.add(pj01Var);
                                }
                                volVar = volVar;
                                it = it;
                                i4 = 1;
                                i5 = 3;
                                i6 = 2;
                                sl01Var = null;
                                break;
                            }
                            npl nplVar9 = volVar;
                            moderationStatus = clientNode.getModerationStatus();
                            momVar = kom.a;
                            if (moderationStatus != null) {
                                statusCase = moderationStatus.getStatusCase();
                                if (statusCase == null) {
                                    i = -1;
                                } else {
                                    i = cdd.j[statusCase.ordinal()];
                                }
                                if (i == 1) {
                                    momVar = new mom(moderationStatus.getReported().getUpdatedAt().q());
                                } else if (i == 2) {
                                    momVar = new lom(moderationStatus.getRemoved().getUpdatedAt().q());
                                } else if (i == 3) {
                                    momVar = new jom();
                                } else if (i == 4) {
                                    momVar = iom.a;
                                } else if (i == 5) {
                                    momVar = hom.a;
                                }
                            }
                            return new tom(nodePathId9, str, w4i1Var9, jQ10, userSeen9, nplVar9, (rom) null, arrayList, arrayList2, momVar, false, xo2Var10, 1088);
                        }
                        break;
                    default:
                        eg.o();
                        return null;
                }
            } else if (i3 != 3) {
                eg.o();
                return null;
            }
        }
        return null;
    }

    public final gxz0 g(ClientNode clientNode) {
        String emojiUtf8 = clientNode.getMessagePayload().getActivityPayload().getReaction().getEmojiUtf8();
        String str = emojiUtf8.length() == 0 ? null : emojiUtf8;
        if (str != null) {
            return new gxz0(clientNode.getNodeIdentifier().getNodePathId(), str, new w4i1(clientNode.getEventCapture().getInitUsername(), clientNode.getEventCapture().getInitUsername(), 8, (String) null), clientNode.getEventCapture().getEventCapture().getOccurredAt().q(), 16);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List h(RetrieveNodeResponse retrieveNodeResponse) throws NoWhenBranchMatchedException {
        goe goeVarE = e(retrieveNodeResponse);
        if (goeVarE == null) {
            return z6x.a;
        }
        List listB = goeVarE.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((tom) obj).b() instanceof lpl) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((tom) it.next());
        }
        return arrayList2;
    }
}
